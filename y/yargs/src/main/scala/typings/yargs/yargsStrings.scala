package typings.yargs

import typings.yargs.yargsMod.PositionalOptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object yargsStrings {
  @js.native
  sealed trait Argv extends js.Object
  
  @js.native
  sealed trait Defined extends js.Object
  
  @js.native
  sealed trait InferredOptionTypes extends js.Object
  
  @js.native
  sealed trait Omit extends js.Object
  
  @js.native
  sealed trait array extends js.Object
  
  @js.native
  sealed trait boolean extends PositionalOptionsType
  
  @js.native
  sealed trait count extends js.Object
  
  @js.native
  sealed trait number extends PositionalOptionsType
  
  @js.native
  sealed trait string extends PositionalOptionsType
  
  @scala.inline
  def Argv: Argv = "Argv".asInstanceOf[Argv]
  @scala.inline
  def Defined: Defined = "Defined".asInstanceOf[Defined]
  @scala.inline
  def InferredOptionTypes: InferredOptionTypes = "InferredOptionTypes".asInstanceOf[InferredOptionTypes]
  @scala.inline
  def Omit: Omit = "Omit".asInstanceOf[Omit]
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
}

