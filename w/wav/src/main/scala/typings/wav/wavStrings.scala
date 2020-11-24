package typings.wav

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wavStrings {
  
  @scala.inline
  def BE: BE = "BE".asInstanceOf[BE]
  
  @scala.inline
  def LE: LE = "LE".asInstanceOf[LE]
  
  @scala.inline
  def chunk: chunk = "chunk".asInstanceOf[chunk]
  
  @scala.inline
  def done: done = "done".asInstanceOf[done]
  
  @scala.inline
  def format: format = "format".asInstanceOf[format]
  
  @scala.inline
  def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait BE extends js.Object
  
  @js.native
  sealed trait LE extends js.Object
  
  @js.native
  sealed trait chunk extends js.Object
  
  @js.native
  sealed trait done extends js.Object
  
  @js.native
  sealed trait format extends js.Object
  
  @js.native
  sealed trait header extends js.Object
}
