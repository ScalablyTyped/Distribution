package typings.typesettable

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
    var XOffsetFactor: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in typesettable.typesettable/build/src/writers/writer.IXAlign ]: number}
      */ typings.typesettable.typesettableStrings.Writer with js.Any = js.native
    var YOffsetFactor: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in typesettable.typesettable/build/src/writers/writer.IYAlign ]: number}
      */ typings.typesettable.typesettableStrings.Writer with js.Any = js.native
  }
  
}

