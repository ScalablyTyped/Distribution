package typings.winrtDashUwp.Windows.Media

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.allow
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.block
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.hide
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.warn
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.ContentRestrictionsBrowsePolicy
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.RatedContentCategory
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.RatedContentCategory.application
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.RatedContentCategory.game
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.RatedContentCategory.general
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.RatedContentCategory.movie
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.RatedContentCategory.music
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.RatedContentCategory.television
import typings.winrtDashUwp.Windows.Media.ContentRestrictions.RatedContentDescription
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.restrictionschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides classes that define Family Safety settings for a Windows user. */
@JSGlobal("Windows.Media.ContentRestrictions")
@js.native
object ContentRestrictions extends js.Object {
  @js.native
  sealed trait ContentAccessRestrictionLevel extends js.Object
  
  /** Contains information used to filter an app's content catalog. */
  @js.native
  abstract class ContentRestrictionsBrowsePolicy () extends js.Object {
    /** Gets the region of the user's content restrictions. */
    var geographicRegion: String = js.native
    /** Gets the maximum allowed age rating level to show in a content catalog. No content rated above this level should be displayed. For example, if the MaxBrowsableAgeRating is 13, MPAA:R rated movies should not be displayed. */
    var maxBrowsableAgeRating: Double = js.native
    /** Gets the maximum allowed rating level for content consumption. */
    var preferredAgeRating: Double = js.native
  }
  
  @js.native
  sealed trait RatedContentCategory extends js.Object
  
  /** Contains information about a piece of content. An app creates a RatedContentDescription object, for each piece of content to be used in the GetRestrictionLevelAsync and RequestContentAccessAsync methods. */
  @js.native
  class RatedContentDescription protected () extends js.Object {
    /**
      * Initializes a new instance of the RatedContentDescription class.
      * @param id The ID of the content, as specified by the app developer.
      * @param title The title of the content.
      * @param category Specifies the type of a piece of content, defined by RatedContentCategory .
      */
    def this(id: String, title: String, category: RatedContentCategory) = this()
    /** Specifies the type of a piece of content, defined by RatedContentCategory . */
    var category: RatedContentCategory = js.native
    /** The unique content ID of a piece of content, in the app's content catalog. */
    var id: String = js.native
    /** The thumbnail image associated with the content. */
    var image: IRandomAccessStreamReference = js.native
    /** Provides all existing third-party and Windows Store age ratings for a piece of content. */
    var ratings: IVector[String] = js.native
    /** The display title of a piece of content. */
    var title: String = js.native
  }
  
  /** Contains all behavior and functionality related to a user's Family Safety content settings. */
  @js.native
  /** Initializes a new instance of the RatedContentRestrictions class. */
  class RatedContentRestrictions () extends js.Object {
    /**
      * Initializes a new instance of the RatedContentRestrictions class, with the specified age rating the app uses, to restrict content usage.
      * @param maxAgeRating The max age rating.
      */
    def this(maxAgeRating: Double) = this()
    /** An event handler to notify apps when there are changes to the user's content settings. */
    @JSName("onrestrictionschanged")
    var onrestrictionschanged_Original: EventHandler[_] = js.native
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_restrictionschanged(`type`: restrictionschanged, listener: EventHandler[_]): Unit = js.native
    /**
      * Gets information that is used filter an app's content catalog.
      * @return Returns a ContentRestrictionsBrowsePolicy object.
      */
    def getBrowsePolicyAsync(): IPromiseWithIAsyncOperation[ContentRestrictionsBrowsePolicy] = js.native
    /**
      * Gets the policy that applies to a piece of content, for content browsing and consumption.
      * @param RatedContentDescription The rated content info.
      * @return This method returns these values:
      */
    def getRestrictionLevelAsync(RatedContentDescription: RatedContentDescription): IPromiseWithIAsyncOperation[ContentAccessRestrictionLevel] = js.native
    /** An event handler to notify apps when there are changes to the user's content settings. */
    def onrestrictionschanged(ev: js.Any with WinRTEvent[_]): Unit = js.native
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_restrictionschanged(`type`: restrictionschanged, listener: EventHandler[_]): Unit = js.native
    /**
      * Determines whether the user is allowed to consume a piece of content.
      * @param RatedContentDescription The rated content info.
      * @return Returns true, if the user can consume the content. Otherwise, returns false.
      */
    def requestContentAccessAsync(RatedContentDescription: RatedContentDescription): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  
  /** Specifies how the content is treated, based on the user's content settings. */
  @js.native
  object ContentAccessRestrictionLevel extends js.Object {
    /** Can be shown in the content catalog and consumed. */
    @js.native
    sealed trait allow extends ContentAccessRestrictionLevel
    
    /** Can be shown in the content catalog, but will be blocked by RequestContentAccessAsync . */
    @js.native
    sealed trait block extends ContentAccessRestrictionLevel
    
    /** Can't be shown in the content catalog. It's rating is higher than the user's settings, determined by MaxBrowsableAgeRating . */
    @js.native
    sealed trait hide extends ContentAccessRestrictionLevel
    
    /** (Xbox only) If multiple users are logged in and the content is blocked for at least one user, content is allowed with a warning displayed. */
    @js.native
    sealed trait warn extends ContentAccessRestrictionLevel
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ContentAccessRestrictionLevel with Double] = js.native
    /* 0 */ @js.native
    object allow extends TopLevel[allow with Double]
    
    /* 2 */ @js.native
    object block extends TopLevel[block with Double]
    
    /* 3 */ @js.native
    object hide extends TopLevel[hide with Double]
    
    /* 1 */ @js.native
    object warn extends TopLevel[warn with Double]
    
  }
  
  /** Specifies the type of a piece of content. */
  @js.native
  object RatedContentCategory extends js.Object {
    /** Apps on Windows 8.1 and Xbox. */
    @js.native
    sealed trait application extends RatedContentCategory
    
    /** Apps on Windows 8.1 and Xbox. */
    @js.native
    sealed trait game extends RatedContentCategory
    
    /** In-app content for Windows 8.1 and Xbox apps. */
    @js.native
    sealed trait general extends RatedContentCategory
    
    /** In-app content for Windows 8.1 and Xbox apps. */
    @js.native
    sealed trait movie extends RatedContentCategory
    
    /** In-app content for Windows 8.1 and Xbox apps. */
    @js.native
    sealed trait music extends RatedContentCategory
    
    /** In-app content for Windows 8.1 and Xbox apps. */
    @js.native
    sealed trait television extends RatedContentCategory
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RatedContentCategory with Double] = js.native
    /* 1 */ @js.native
    object application extends TopLevel[application with Double]
    
    /* 2 */ @js.native
    object game extends TopLevel[game with Double]
    
    /* 0 */ @js.native
    object general extends TopLevel[general with Double]
    
    /* 3 */ @js.native
    object movie extends TopLevel[movie with Double]
    
    /* 5 */ @js.native
    object music extends TopLevel[music with Double]
    
    /* 4 */ @js.native
    object television extends TopLevel[television with Double]
    
  }
  
}

