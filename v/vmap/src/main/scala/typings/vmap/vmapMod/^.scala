package typings.vmap.vmapMod

import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VMAP parser
  */
@JSImport("vmap", JSImport.Namespace)
@js.native
class ^ protected () extends VMAP {
  def this(xml: Document) = this()
  /**
    * An array of VMAPAdBreak objects
    */
  /* CompleteClass */
  override var adBreaks: js.Array[VMAPAdBreak] = js.native
  /**
    * An array of VMAPExtension objects
    */
  /* CompleteClass */
  override var extensions: js.Array[VMAPExtension] = js.native
  /**
    * The VMAP version (should be 1.0)
    */
  /* CompleteClass */
  override var version: String = js.native
}

