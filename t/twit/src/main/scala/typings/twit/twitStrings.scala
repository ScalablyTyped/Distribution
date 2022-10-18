package typings.twit

import typings.twit.mod.StreamEndpoint
import typings.twit.mod.Twitter.ResultType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twitStrings {
  
  @js.native
  sealed trait Point extends StObject
  inline def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait crop extends StObject
  inline def crop: crop = "crop".asInstanceOf[crop]
  
  @js.native
  sealed trait fit extends StObject
  inline def fit: fit = "fit".asInstanceOf[fit]
  
  @js.native
  sealed trait location extends StObject
  inline def location: location = "location".asInstanceOf[location]
  
  @js.native
  sealed trait low extends StObject
  inline def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait media extends StObject
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait medium extends StObject
  inline def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait message_create extends StObject
  inline def message_create: message_create = "message_create".asInstanceOf[message_create]
  
  @js.native
  sealed trait mixed
    extends StObject
       with ResultType
  inline def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait options extends StObject
  inline def options: options = "options".asInstanceOf[options]
  
  @js.native
  sealed trait popular
    extends StObject
       with ResultType
  inline def popular: popular = "popular".asInstanceOf[popular]
  
  @js.native
  sealed trait `private` extends StObject
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait public extends StObject
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait recent
    extends StObject
       with ResultType
  inline def recent: recent = "recent".asInstanceOf[recent]
  
  @js.native
  sealed trait shared_coordinate extends StObject
  inline def shared_coordinate: shared_coordinate = "shared_coordinate".asInstanceOf[shared_coordinate]
  
  @js.native
  sealed trait site
    extends StObject
       with StreamEndpoint
  inline def site: site = "site".asInstanceOf[site]
  
  @js.native
  sealed trait statusesSlashfilter
    extends StObject
       with StreamEndpoint
  inline def statusesSlashfilter: statusesSlashfilter = "statuses/filter".asInstanceOf[statusesSlashfilter]
  
  @js.native
  sealed trait statusesSlashfirehose
    extends StObject
       with StreamEndpoint
  inline def statusesSlashfirehose: statusesSlashfirehose = "statuses/firehose".asInstanceOf[statusesSlashfirehose]
  
  @js.native
  sealed trait statusesSlashsample
    extends StObject
       with StreamEndpoint
  inline def statusesSlashsample: statusesSlashsample = "statuses/sample".asInstanceOf[statusesSlashsample]
  
  @js.native
  sealed trait user
    extends StObject
       with StreamEndpoint
  inline def user: user = "user".asInstanceOf[user]
}
