package typings.xmlbuilder.xmlbuilderMod

import org.scalablytyped.runtime.TopLevel
import typings.xmlbuilder.xmlbuilderMod.WriterState.CloseTag
import typings.xmlbuilder.xmlbuilderMod.WriterState.InsideTag
import typings.xmlbuilder.xmlbuilderMod.WriterState.None
import typings.xmlbuilder.xmlbuilderMod.WriterState.OpenTag
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
  sealed trait CloseTag extends WriterState
  
  /**
    * Writer is inside an element
    */
  @js.native
  sealed trait InsideTag extends WriterState
  
  /**
    * Writer state is unknown
    */
  @js.native
  sealed trait None extends WriterState
  
  /**
    * Writer is at an opening tag, e.g. `<node>`
    */
  @js.native
  sealed trait OpenTag extends WriterState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriterState with Double] = js.native
  /* 3 */ @js.native
  object CloseTag extends TopLevel[CloseTag with Double]
  
  /* 2 */ @js.native
  object InsideTag extends TopLevel[InsideTag with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object OpenTag extends TopLevel[OpenTag with Double]
  
}

/**
  * Defines the state of the writer.
  */
@JSImport("xmlbuilder", "writerState")
@js.native
object writerState extends js.Object {
  /* 3 */ val CloseTag: typings.xmlbuilder.xmlbuilderMod.WriterState.CloseTag with Double = js.native
  /* 2 */ val InsideTag: typings.xmlbuilder.xmlbuilderMod.WriterState.InsideTag with Double = js.native
  /* 0 */ val None: typings.xmlbuilder.xmlbuilderMod.WriterState.None with Double = js.native
  /* 1 */ val OpenTag: typings.xmlbuilder.xmlbuilderMod.WriterState.OpenTag with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriterState with Double] = js.native
}

