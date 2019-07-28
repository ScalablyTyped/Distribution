package typings.twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object twitterStrings {
  @js.native
  sealed trait site extends js.Object
  
  @js.native
  sealed trait user extends js.Object
  
  @scala.inline
  def site: site = "site".asInstanceOf[site]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
}

