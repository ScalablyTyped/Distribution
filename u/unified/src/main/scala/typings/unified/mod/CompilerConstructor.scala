package typings.unified.mod

import org.scalablytyped.runtime.Instantiable2
import typings.unist.mod.Node
import typings.vfile.mod.VFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A constructor function (a function with keys in its `prototype`) or class that implements a
  * `compile` method.
  */
@js.native
trait CompilerConstructor extends /**
  * Creates a Compiler
  *
  * @param node Node/tree to be stringified
  * @param file File associated with node
  */
Instantiable2[/* node */ Node, /* file */ VFile, Compiler]
