package typings.typesettable

import typings.typesettable.anon.KinIXAlignnumber
import typings.typesettable.anon.KinIYAlignnumber
import typings.typesettable.contextsMod.IPenFactoryContext
import typings.typesettable.measurersMod.AbstractMeasurer
import typings.typesettable.wrappersMod.Wrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writerMod {
  
  @JSImport("typesettable/build/src/writers/writer", "Writer")
  @js.native
  open class Writer protected () extends StObject {
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[Any]) = this()
    def this(_measurer: AbstractMeasurer, _penFactory: IPenFactoryContext[Any], _wrapper: Wrapper) = this()
    
    /* private */ var _measurer: Any = js.native
    
    /* private */ var _penFactory: Any = js.native
    
    /* private */ var _wrapper: Any = js.native
    
    def measurer(newMeasurer: AbstractMeasurer): Writer = js.native
    
    def penFactory(newPenFactory: IPenFactoryContext[Any]): Writer = js.native
    
    def wrapper(newWrapper: Wrapper): Writer = js.native
    
    /**
      * Writes the text into the container. If no container is specified, the pen's
      * default container will be used.
      */
    def write[T](text: String, width: Double, height: Double): Unit = js.native
    def write[T](text: String, width: Double, height: Double, options: Unit, container: T): Unit = js.native
    def write[T](text: String, width: Double, height: Double, options: IWriteOptions): Unit = js.native
    def write[T](text: String, width: Double, height: Double, options: IWriteOptions, container: T): Unit = js.native
    
    /* private */ def writeLines(lines: Any, linePen: Any, width: Any, lineHeight: Any, shearShift: Any, xAlign: Any): Any = js.native
  }
  /* static members */
  object Writer {
    
    @JSImport("typesettable/build/src/writers/writer", "Writer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typesettable/build/src/writers/writer", "Writer.SupportedRotation")
    @js.native
    def SupportedRotation: Any = js.native
    inline def SupportedRotation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SupportedRotation")(x.asInstanceOf[js.Any])
    
    @JSImport("typesettable/build/src/writers/writer", "Writer.XOffsetFactor")
    @js.native
    def XOffsetFactor: KinIXAlignnumber = js.native
    inline def XOffsetFactor_=(x: KinIXAlignnumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XOffsetFactor")(x.asInstanceOf[js.Any])
    
    @JSImport("typesettable/build/src/writers/writer", "Writer.YOffsetFactor")
    @js.native
    def YOffsetFactor: KinIYAlignnumber = js.native
    inline def YOffsetFactor_=(x: KinIYAlignnumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YOffsetFactor")(x.asInstanceOf[js.Any])
  }
  
  trait IPen extends StObject {
    
    /**
      * Called once all the lines have been written
      */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called once for each line of text in the block.
      *
      * `xOffset` and `yOffset` are assumed to be in an independent text-aligned
      * coordinate space.
      */
    def write(line: String, width: Double, anchor: IXAlign, xOffset: Double, yOffset: Double): Unit
  }
  object IPen {
    
    inline def apply(write: (String, Double, IXAlign, Double, Double) => Unit): IPen = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction5(write))
      __obj.asInstanceOf[IPen]
    }
    
    extension [Self <: IPen](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setWrite(value: (String, Double, IXAlign, Double, Double) => Unit): Self = StObject.set(x, "write", js.Any.fromFunction5(value))
    }
  }
  
  type IPenFactory[T] = js.Function3[/* text */ String, /* transform */ ITransform, /* container */ js.UndefOr[T], IPen]
  
  trait ITransform extends StObject {
    
    /**
      * Rotation in degrees.
      */
    var rotate: Double
    
    /**
      * Translation in pixels.
      */
    var translate: js.Tuple2[Double, Double]
  }
  object ITransform {
    
    inline def apply(rotate: Double, translate: js.Tuple2[Double, Double]): ITransform = {
      val __obj = js.Dynamic.literal(rotate = rotate.asInstanceOf[js.Any], translate = translate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITransform]
    }
    
    extension [Self <: ITransform](x: Self) {
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setTranslate(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWriteOptions extends StObject {
    
    /**
      * An optional cardinal-direction rotation for the whole text block.
      *
      * Supported rotations are -90, 0, 180, and 90.
      *
      * @default 0
      */
    var textRotation: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional shear angle. Shearing allows the rotation and re-alignment of
      * individual lines as opposed to the whole text block.
      *
      * Supported shears are between -80 and 80 degrees.
      *
      * @default 0
      */
    var textShear: js.UndefOr[Double] = js.undefined
    
    /**
      * The x-alignment of text.
      *
      * @default "left"
      */
    var xAlign: js.UndefOr[IXAlign] = js.undefined
    
    /**
      * The y-alignment of text.
      *
      * @default "top"
      */
    var yAlign: js.UndefOr[IYAlign] = js.undefined
  }
  object IWriteOptions {
    
    inline def apply(): IWriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IWriteOptions]
    }
    
    extension [Self <: IWriteOptions](x: Self) {
      
      inline def setTextRotation(value: Double): Self = StObject.set(x, "textRotation", value.asInstanceOf[js.Any])
      
      inline def setTextRotationUndefined: Self = StObject.set(x, "textRotation", js.undefined)
      
      inline def setTextShear(value: Double): Self = StObject.set(x, "textShear", value.asInstanceOf[js.Any])
      
      inline def setTextShearUndefined: Self = StObject.set(x, "textShear", js.undefined)
      
      inline def setXAlign(value: IXAlign): Self = StObject.set(x, "xAlign", value.asInstanceOf[js.Any])
      
      inline def setXAlignUndefined: Self = StObject.set(x, "xAlign", js.undefined)
      
      inline def setYAlign(value: IYAlign): Self = StObject.set(x, "yAlign", value.asInstanceOf[js.Any])
      
      inline def setYAlignUndefined: Self = StObject.set(x, "yAlign", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typesettable.typesettableStrings.left
    - typings.typesettable.typesettableStrings.center
    - typings.typesettable.typesettableStrings.right
  */
  trait IXAlign extends StObject
  object IXAlign {
    
    inline def center: typings.typesettable.typesettableStrings.center = "center".asInstanceOf[typings.typesettable.typesettableStrings.center]
    
    inline def left: typings.typesettable.typesettableStrings.left = "left".asInstanceOf[typings.typesettable.typesettableStrings.left]
    
    inline def right: typings.typesettable.typesettableStrings.right = "right".asInstanceOf[typings.typesettable.typesettableStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.typesettable.typesettableStrings.top
    - typings.typesettable.typesettableStrings.center
    - typings.typesettable.typesettableStrings.bottom
  */
  trait IYAlign extends StObject
  object IYAlign {
    
    inline def bottom: typings.typesettable.typesettableStrings.bottom = "bottom".asInstanceOf[typings.typesettable.typesettableStrings.bottom]
    
    inline def center: typings.typesettable.typesettableStrings.center = "center".asInstanceOf[typings.typesettable.typesettableStrings.center]
    
    inline def top: typings.typesettable.typesettableStrings.top = "top".asInstanceOf[typings.typesettable.typesettableStrings.top]
  }
}
