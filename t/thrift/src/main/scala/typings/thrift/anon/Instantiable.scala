package typings.thrift.anon

import org.scalablytyped.runtime.Instantiable1
import typings.thrift.mod.TProcessorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instantiable[THandler, TProcessor]
  extends TProcessorConstructor[TProcessor, THandler]
     with Instantiable1[/* handler */ THandler, TProcessor]

