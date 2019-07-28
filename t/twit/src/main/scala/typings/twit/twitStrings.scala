package typings.twit

import typings.twit.twitMod.StreamEndpoint
import typings.twit.twitMod.TwitterNs.ResultType
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
  sealed trait `statuses/filter` extends StreamEndpoint
  
  @js.native
  sealed trait `statuses/firehose` extends StreamEndpoint
  
  @js.native
  sealed trait `statuses/sample` extends StreamEndpoint
  
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
  def `statuses/filter`: `statuses/filter` = "statuses/filter".asInstanceOf[`statuses/filter`]
  @scala.inline
  def `statuses/firehose`: `statuses/firehose` = "statuses/firehose".asInstanceOf[`statuses/firehose`]
  @scala.inline
  def `statuses/sample`: `statuses/sample` = "statuses/sample".asInstanceOf[`statuses/sample`]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
}

