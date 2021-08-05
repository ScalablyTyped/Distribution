package typings.typesettable

import typings.typesettable.anon.KinIXAlignnumber
import typings.typesettable.anon.KinIYAlignnumber
import typings.typesettable.contextsMod.IPenFactoryContext
import typings.typesettable.measurersMod.AbstractMeasurer
import typings.typesettable.wrappersMod.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writersMod {
  
  @JSImport("typesettable/build/src/writers", "Writer")
  @js.native
  class Writer protected ()
    extends typings.typesettable.writerMod.Writer {
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[js.Any]) = this()
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[js.Any], _wrapper: Wrapper) = this()
  }
  /* static members */
  object Writer {
    
    @JSImport("typesettable/build/src/writers", "Writer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable/build/src/writers", "Writer.SupportedRotation")
    @js.native
    def SupportedRotation: js.Any = js.native
    inline def SupportedRotation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SupportedRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("typesettable/build/src/writers", "Writer.XOffsetFactor")
    @js.native
    def XOffsetFactor: KinIXAlignnumber = js.native
    inline def XOffsetFactor_=(x: KinIXAlignnumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XOffsetFactor")(x.asInstanceOf[js.Any])
    
    @JSImport("typesettable/build/src/writers", "Writer.YOffsetFactor")
    @js.native
    def YOffsetFactor: KinIYAlignnumber = js.native
    inline def YOffsetFactor_=(x: KinIYAlignnumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YOffsetFactor")(x.asInstanceOf[js.Any])
  }
}
