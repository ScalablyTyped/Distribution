package typings.vmap.vmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VMAP parser
  */
trait VMAP extends js.Object {
  /**
    * An array of VMAPAdBreak objects
    */
  var adBreaks: js.Array[VMAPAdBreak]
  /**
    * An array of VMAPExtension objects
    */
  var extensions: js.Array[VMAPExtension]
  /**
    * The VMAP version (should be 1.0)
    */
  var version: String
}

object VMAP {
  @scala.inline
  def apply(adBreaks: js.Array[VMAPAdBreak], extensions: js.Array[VMAPExtension], version: String): VMAP = {
    val __obj = js.Dynamic.literal(adBreaks = adBreaks, extensions = extensions, version = version)
  
    __obj.asInstanceOf[VMAP]
  }
}

