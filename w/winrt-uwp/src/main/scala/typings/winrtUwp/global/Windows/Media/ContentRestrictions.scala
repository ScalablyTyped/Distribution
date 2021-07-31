package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes that define Family Safety settings for a Windows user. */
object ContentRestrictions {
  
  /** Specifies how the content is treated, based on the user's content settings. */
  @JSGlobal("Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel")
  @js.native
  object ContentAccessRestrictionLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel & Double
      ] = js.native
    
    /* 0 */ val allow: typings.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.allow & Double = js.native
    
    /* 2 */ val block: typings.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.block & Double = js.native
    
    /* 3 */ val hide: typings.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.hide & Double = js.native
    
    /* 1 */ val warn: typings.winrtUwp.Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel.warn & Double = js.native
  }
  
  /** Contains information used to filter an app's content catalog. */
  @JSGlobal("Windows.Media.ContentRestrictions.ContentRestrictionsBrowsePolicy")
  @js.native
  abstract class ContentRestrictionsBrowsePolicy ()
    extends StObject
       with typings.winrtUwp.Windows.Media.ContentRestrictions.ContentRestrictionsBrowsePolicy {
    
    /** Gets the region of the user's content restrictions. */
    /* CompleteClass */
    var geographicRegion: String = js.native
    
    /** Gets the maximum allowed age rating level to show in a content catalog. No content rated above this level should be displayed. For example, if the MaxBrowsableAgeRating is 13, MPAA:R rated movies should not be displayed. */
    /* CompleteClass */
    var maxBrowsableAgeRating: Double = js.native
    
    /** Gets the maximum allowed rating level for content consumption. */
    /* CompleteClass */
    var preferredAgeRating: Double = js.native
  }
  
  /** Specifies the type of a piece of content. */
  @JSGlobal("Windows.Media.ContentRestrictions.RatedContentCategory")
  @js.native
  object RatedContentCategory extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory & Double] = js.native
    
    /* 1 */ val application: typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.application & Double = js.native
    
    /* 2 */ val game: typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.game & Double = js.native
    
    /* 0 */ val general: typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.general & Double = js.native
    
    /* 3 */ val movie: typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.movie & Double = js.native
    
    /* 5 */ val music: typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.music & Double = js.native
    
    /* 4 */ val television: typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentCategory.television & Double = js.native
  }
  
  /** Contains information about a piece of content. An app creates a RatedContentDescription object, for each piece of content to be used in the GetRestrictionLevelAsync and RequestContentAccessAsync methods. */
  @JSGlobal("Windows.Media.ContentRestrictions.RatedContentDescription")
  @js.native
  class RatedContentDescription protected ()
    extends StObject
       with typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentDescription {
    /**
      * Initializes a new instance of the RatedContentDescription class.
      * @param id The ID of the content, as specified by the app developer.
      * @param title The title of the content.
      * @param category Specifies the type of a piece of content, defined by RatedContentCategory .
      */
    def this(id: String, title: String, category: RatedContentCategory) = this()
    
    /** Specifies the type of a piece of content, defined by RatedContentCategory . */
    /* CompleteClass */
    var category: RatedContentCategory = js.native
    
    /** The unique content ID of a piece of content, in the app's content catalog. */
    /* CompleteClass */
    var id: String = js.native
    
    /** The thumbnail image associated with the content. */
    /* CompleteClass */
    var image: IRandomAccessStreamReference = js.native
    
    /** Provides all existing third-party and Windows Store age ratings for a piece of content. */
    /* CompleteClass */
    var ratings: IVector[String] = js.native
    
    /** The display title of a piece of content. */
    /* CompleteClass */
    var title: String = js.native
  }
  
  /** Contains all behavior and functionality related to a user's Family Safety content settings. */
  @JSGlobal("Windows.Media.ContentRestrictions.RatedContentRestrictions")
  @js.native
  /** Initializes a new instance of the RatedContentRestrictions class. */
  class RatedContentRestrictions ()
    extends StObject
       with typings.winrtUwp.Windows.Media.ContentRestrictions.RatedContentRestrictions {
    /**
      * Initializes a new instance of the RatedContentRestrictions class, with the specified age rating the app uses, to restrict content usage.
      * @param maxAgeRating The max age rating.
      */
    def this(maxAgeRating: Double) = this()
  }
}
