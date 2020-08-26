package typings.tryghostContentApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocialMedia
  extends Facebook
     with Twitter

object SocialMedia {
  @scala.inline
  def apply(): SocialMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocialMedia]
  }
}

