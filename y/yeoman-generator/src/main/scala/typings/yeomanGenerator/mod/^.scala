package typings.yeomanGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Generator` class provides the common API shared by all generators.
  * It define options, arguments, file, prompt, log, API, etc.
  *
  * Every generator should extend this base class.
  */
@JSImport("yeoman-generator", JSImport.Namespace)
@js.native
class ^[T /* <: GeneratorOptions */] protected () extends Generator[T] {
  def this(args: String, options: T) = this()
  def this(args: js.Array[String], options: T) = this()
}
