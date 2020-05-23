package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides classes that define Family Safety settings for a Windows user. */
@JSGlobal("Windows.Media.ContentRestrictions")
@js.native
object ContentRestrictions extends js.Object {
  /** Contains information used to filter an app's content catalog. */
  @js.native
  abstract class ContentRestrictionsBrowsePolicy ()
    extends typings.winrtUwp.Windows.Media.ContentRestrictions.ContentRestrictionsBrowsePolicy {
    /** Gets the region of the user's content restrictions. */
    /* CompleteClass */
    override var geographicRegion: String = js.native
    /** Gets the maximum allowed age rating level to show in a content catalog. No content rated above this level should be displayed. For example, if the MaxBrowsableAgeRating is 13, MPAA:R rated movies should not be displayed. */
    /* CompleteClass */
    override var maxBrowsableAgeRating: Double = js.native
    /** Gets the maximum allowed rating level for content consumption. */
    /* CompleteClass */
    override var preferredAgeRating: Double = js.native
  }
  
  /** Contains information about a piece of content. An app creates a RatedContentDescription object, for each piece of content to be used in the GetRestrictionLevelAsync and RequestContentAccessAsync methods. */
  @js.native
  class RatedContentDescription protected ()
    extends typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentDescription {
    /**
      * Initializes a new instance of the RatedContentDescription class.
      * @param id The ID of the content, as specified by the app developer.
      * @param title The title of the content.
      * @param category Specifies the type of a piece of content, defined by RatedContentCategory .
      */
    def this(id: String, title: String, category: RatedContentCategory) = this()
    /** Specifies the type of a piece of content, defined by RatedContentCategory . */
    /* CompleteClass */
    override var category: RatedContentCategory = js.native
    /** The unique content ID of a piece of content, in the app's content catalog. */
    /* CompleteClass */
    override var id: String = js.native
    /** The thumbnail image associated with the content. */
    /* CompleteClass */
    override var image: IRandomAccessStreamReference = js.native
    /** Provides all existing third-party and Windows Store age ratings for a piece of content. */
    /* CompleteClass */
    override var ratings: IVector[String] = js.native
    /** The display title of a piece of content. */
    /* CompleteClass */
    override var title: String = js.native
  }
  
  /** Contains all behavior and functionality related to a user's Family Safety content settings. */
  @js.native
  /** Initializes a new instance of the RatedContentRestrictions class. */
  class RatedContentRestrictions ()
    extends typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentRestrictions {
    /**
      * Initializes a new instance of the RatedContentRestrictions class, with the specified age rating the app uses, to restrict content usage.
      * @param maxAgeRating The max age rating.
      */
    def this(maxAgeRating: Double) = this()
  }
  
  /** Specifies how the content is treated, based on the user's content settings. */
  @js.native
  object ContentAccessRestrictionLevel extends js.Object {
    /* 0 */ val allow: typings.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.allow with Double = js.native
    /* 2 */ val block: typings.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.block with Double = js.native
    /* 3 */ val hide: typings.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.hide with Double = js.native
    /* 1 */ val warn: typings.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.warn with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel with Double
      ] = js.native
  }
  
  /** Specifies the type of a piece of content. */
  @js.native
  object RatedContentCategory extends js.Object {
    /* 1 */ val application: typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.application with Double = js.native
    /* 2 */ val game: typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.game with Double = js.native
    /* 0 */ val general: typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.general with Double = js.native
    /* 3 */ val movie: typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.movie with Double = js.native
    /* 5 */ val music: typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.music with Double = js.native
    /* 4 */ val television: typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.television with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory with Double
      ] = js.native
  }
  
}

