package typings.typesettable

import typings.typesettable.anon.KinIXAlignnumber
import typings.typesettable.anon.KinIYAlignnumber
import typings.typesettable.contextsMod.IPenFactoryContext
import typings.typesettable.measurersMod.AbstractMeasurer
import typings.typesettable.wrappersMod.Wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/writers", JSImport.Namespace)
@js.native
object writersMod extends js.Object {
  @js.native
  class Writer protected ()
    extends typings.typesettable.writerMod.Writer {
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[_]) = this()
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[_], _wrapper: Wrapper) = this()
  }
  
  /* static members */
  @js.native
  object Writer extends js.Object {
    var SupportedRotation: js.Any = js.native
    var XOffsetFactor: KinIXAlignnumber = js.native
    var YOffsetFactor: KinIYAlignnumber = js.native
  }
  
}

