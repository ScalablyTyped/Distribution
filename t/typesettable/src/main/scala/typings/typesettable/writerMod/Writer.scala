package typings.typesettable.writerMod

import typings.typesettable.anon.KinIXAlignnumber
import typings.typesettable.anon.KinIYAlignnumber
import typings.typesettable.contextsMod.IPenFactoryContext
import typings.typesettable.measurersMod.AbstractMeasurer
import typings.typesettable.wrappersMod.Wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable/build/src/writers/writer", "Writer")
@js.native
class Writer protected () extends js.Object {
  def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[_]) = this()
  def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[_], _wrapper: Wrapper) = this()
  
  var _measurer: js.Any = js.native
  
  var _penFactory: js.Any = js.native
  
  var _wrapper: js.Any = js.native
  
  def measurer(newMeasurer: AbstractMeasurer): Writer = js.native
  
  def penFactory(newPenFactory: IPenFactoryContext[_]): Writer = js.native
  
  def wrapper(newWrapper: Wrapper): Writer = js.native
  
  /**
    * Writes the text into the container. If no container is specified, the pen's
    * default container will be used.
    */
  def write[T](text: String, width: Double, height: Double): Unit = js.native
  def write[T](text: String, width: Double, height: Double, options: js.UndefOr[scala.Nothing], container: T): Unit = js.native
  def write[T](text: String, width: Double, height: Double, options: IWriteOptions): Unit = js.native
  def write[T](text: String, width: Double, height: Double, options: IWriteOptions, container: T): Unit = js.native
  
  /* private */ def writeLines(
    lines: js.Any,
    linePen: js.Any,
    width: js.Any,
    lineHeight: js.Any,
    shearShift: js.Any,
    xAlign: js.Any
  ): js.Any = js.native
}
/* static members */
@JSImport("typesettable/build/src/writers/writer", "Writer")
@js.native
object Writer extends js.Object {
  
  var SupportedRotation: js.Any = js.native
  
  var XOffsetFactor: KinIXAlignnumber = js.native
  
  var YOffsetFactor: KinIYAlignnumber = js.native
}
