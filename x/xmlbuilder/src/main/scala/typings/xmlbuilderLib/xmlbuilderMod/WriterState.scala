package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WriterState extends js.Object

@JSImport("xmlbuilder", "WriterState")
@js.native
object WriterState extends js.Object {
  @js.native
  sealed trait CloseTag
    extends xmlbuilderLib.xmlbuilderMod.WriterState
  
  @js.native
  sealed trait InsideTag
    extends xmlbuilderLib.xmlbuilderMod.WriterState
  
  @js.native
  sealed trait None
    extends xmlbuilderLib.xmlbuilderMod.WriterState
  
  @js.native
  sealed trait OpenTag
    extends xmlbuilderLib.xmlbuilderMod.WriterState
  
  /* 3 */ val CloseTag: CloseTag with scala.Double = js.native
  /* 2 */ val InsideTag: InsideTag with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val OpenTag: OpenTag with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xmlbuilderLib.xmlbuilderMod.WriterState with scala.Double] = js.native
}

