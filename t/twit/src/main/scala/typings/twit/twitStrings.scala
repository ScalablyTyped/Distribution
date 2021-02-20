package typings.twit

import typings.twit.mod.StreamEndpoint
import typings.twit.mod.Twitter.ResultType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twitStrings {
  
  @js.native
  sealed trait crop extends StObject
  @scala.inline
  def crop: crop = "crop".asInstanceOf[crop]
  
  @js.native
  sealed trait fit extends StObject
  @scala.inline
  def fit: fit = "fit".asInstanceOf[fit]
  
  @js.native
  sealed trait low extends StObject
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  
  @js.native
  sealed trait medium extends StObject
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  
  @js.native
  sealed trait mixed extends ResultType
  @scala.inline
  def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @js.native
  sealed trait none extends StObject
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait popular extends ResultType
  @scala.inline
  def popular: popular = "popular".asInstanceOf[popular]
  
  @js.native
  sealed trait `private` extends StObject
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait public extends StObject
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait recent extends ResultType
  @scala.inline
  def recent: recent = "recent".asInstanceOf[recent]
  
  @js.native
  sealed trait site extends StreamEndpoint
  @scala.inline
  def site: site = "site".asInstanceOf[site]
  
  @js.native
  sealed trait statusesSlashfilter extends StreamEndpoint
  @scala.inline
  def statusesSlashfilter: statusesSlashfilter = "statuses/filter".asInstanceOf[statusesSlashfilter]
  
  @js.native
  sealed trait statusesSlashfirehose extends StreamEndpoint
  @scala.inline
  def statusesSlashfirehose: statusesSlashfirehose = "statuses/firehose".asInstanceOf[statusesSlashfirehose]
  
  @js.native
  sealed trait statusesSlashsample extends StreamEndpoint
  @scala.inline
  def statusesSlashsample: statusesSlashsample = "statuses/sample".asInstanceOf[statusesSlashsample]
  
  @js.native
  sealed trait user extends StreamEndpoint
  @scala.inline
  def user: user = "user".asInstanceOf[user]
}
