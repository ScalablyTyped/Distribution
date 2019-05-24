package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WriterState extends js.Object

/**
  * Defines the state of the writer.
  */
@JSImport("xmlbuilder", "WriterState")
@js.native
object WriterState extends js.Object {
  /**
    * Writer is at a closing tag, e.g. `</node>`
    */
  @js.native
  sealed trait CloseTag
    extends xmlbuilderLib.xmlbuilderMod.WriterState
  
  /**
    * Writer is inside an element
    */
  @js.native
  sealed trait InsideTag
    extends xmlbuilderLib.xmlbuilderMod.WriterState
  
  /**
    * Writer state is unknown
    */
  @js.native
  sealed trait None
    extends xmlbuilderLib.xmlbuilderMod.WriterState
  
  /**
    * Writer is at an opening tag, e.g. `<node>`
    */
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

/**
  * Defines the state of the writer.
  */
@JSImport("xmlbuilder", "writerState")
@js.native
object writerState extends js.Object {
  /* 3 */ val CloseTag: xmlbuilderLib.xmlbuilderMod.WriterState.CloseTag with scala.Double = js.native
  /* 2 */ val InsideTag: xmlbuilderLib.xmlbuilderMod.WriterState.InsideTag with scala.Double = js.native
  /* 0 */ val None: xmlbuilderLib.xmlbuilderMod.WriterState.None with scala.Double = js.native
  /* 1 */ val OpenTag: xmlbuilderLib.xmlbuilderMod.WriterState.OpenTag with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[xmlbuilderLib.xmlbuilderMod.WriterState with scala.Double] = js.native
}

