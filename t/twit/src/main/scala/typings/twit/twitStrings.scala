package typings.twit

import typings.twit.mod.StreamEndpoint
import typings.twit.mod.Twitter.ResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object twitStrings {
  @js.native
  sealed trait crop extends js.Object
  
  @js.native
  sealed trait fit extends js.Object
  
  @js.native
  sealed trait low extends js.Object
  
  @js.native
  sealed trait medium extends js.Object
  
  @js.native
  sealed trait mixed extends ResultType
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait popular extends ResultType
  
  @js.native
  sealed trait recent extends ResultType
  
  @js.native
  sealed trait site extends StreamEndpoint
  
  @js.native
  sealed trait statusesSlashfilter extends StreamEndpoint
  
  @js.native
  sealed trait statusesSlashfirehose extends StreamEndpoint
  
  @js.native
  sealed trait statusesSlashsample extends StreamEndpoint
  
  @js.native
  sealed trait user extends StreamEndpoint
  
  @scala.inline
  def crop: crop = "crop".asInstanceOf[crop]
  @scala.inline
  def fit: fit = "fit".asInstanceOf[fit]
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  @scala.inline
  def medium: medium = "medium".asInstanceOf[medium]
  @scala.inline
  def mixed: mixed = "mixed".asInstanceOf[mixed]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def popular: popular = "popular".asInstanceOf[popular]
  @scala.inline
  def recent: recent = "recent".asInstanceOf[recent]
  @scala.inline
  def site: site = "site".asInstanceOf[site]
  @scala.inline
  def statusesSlashfilter: statusesSlashfilter = "statuses/filter".asInstanceOf[statusesSlashfilter]
  @scala.inline
  def statusesSlashfirehose: statusesSlashfirehose = "statuses/firehose".asInstanceOf[statusesSlashfirehose]
  @scala.inline
  def statusesSlashsample: statusesSlashsample = "statuses/sample".asInstanceOf[statusesSlashsample]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
}

