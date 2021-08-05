package typings.terminalKit

import typings.terminalKit.anon.FinalCall
import typings.terminalKit.anon.Height
import typings.terminalKit.anon.Misc
import typings.terminalKit.anon.`5`
import typings.terminalKit.rectMod.Region
import typings.terminalKit.screenBufferMod.Attributes
import typings.terminalKit.screenBufferMod.DrawOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textBufferMod {
  
  @JSImport("terminal-kit/TextBuffer", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with TextBuffer {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    var dst: typings.terminalKit.screenBufferMod.^
    
    var forceInBound: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var tabWidth: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(dst: typings.terminalKit.screenBufferMod.^): Options = {
      val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDst(value: typings.terminalKit.screenBufferMod.^): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
      
      inline def setForceInBound(value: Double): Self = StObject.set(x, "forceInBound", value.asInstanceOf[js.Any])
      
      inline def setForceInBoundUndefined: Self = StObject.set(x, "forceInBound", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      inline def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait TextBuffer extends StObject {
    
    def bulkDelete(): Unit = js.native
    def bulkDelete(n: Double): Unit = js.native
    
    def delete(): Unit = js.native
    def delete(n: Double): Unit = js.native
    
    def draw(): Unit = js.native
    def draw(options: DrawOptions): Unit = js.native
    
    def drawCursor(): Unit = js.native
    def drawCursor(options: `5`): Unit = js.native
    
    def getContentSize(): Height = js.native
    
    def getHidden(): Boolean = js.native
    
    def getMisc(): js.Any = js.native
    
    def getMiscAt(x: Double, y: Double): js.Any = js.native
    
    def getText(): String = js.native
    
    def insert(text: String): Unit = js.native
    def insert(text: String, attr: Double): Unit = js.native
    def insert(text: String, attr: Attributes): Unit = js.native
    
    def iterate(options: FinalCall, callback: js.Function1[/* cellData */ Misc, Unit]): Unit = js.native
    
    def joinLine(): Unit = js.native
    
    def load(filepath: String, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    def move(x: Double, y: Double): Unit = js.native
    
    def moveBackward(justSkipNullCells: Boolean): Unit = js.native
    
    def moveDown(): Unit = js.native
    
    def moveForward(justSkipNullCells: Boolean): Unit = js.native
    
    def moveInBound(ignoreCx: Boolean): Unit = js.native
    
    def moveLeft(): Unit = js.native
    
    def moveRight(): Unit = js.native
    
    def moveTo(x: Double, y: Double): Unit = js.native
    
    def moveToColumn(x: Double): Unit = js.native
    
    def moveToEndOfLine(): Unit = js.native
    
    def moveToLine(y: Double): Unit = js.native
    
    def moveToRow(y: Double): Unit = js.native
    
    def moveUp(): Unit = js.native
    
    def newLine(): Unit = js.native
    
    def save(filepath: String, callback: js.Function1[/* error */ js.UndefOr[js.Any], Unit]): Unit = js.native
    
    def setAttrAt(attr: Double, x: Double, y: Double): Unit = js.native
    def setAttrAt(attr: Attributes, x: Double, y: Double): Unit = js.native
    
    def setAttrCodeAt(attr: Double, x: Double, y: Double): Unit = js.native
    
    def setAttrCodeRegion(attr: Double): Unit = js.native
    def setAttrCodeRegion(attr: Double, region: Region): Unit = js.native
    
    def setAttrRegion(attr: Double): Unit = js.native
    def setAttrRegion(attr: Double, region: Region): Unit = js.native
    def setAttrRegion(attr: Attributes): Unit = js.native
    def setAttrRegion(attr: Attributes, region: Region): Unit = js.native
    
    def setEmptyCellAttr(attr: Double): Unit = js.native
    def setEmptyCellAttr(attr: Attributes): Unit = js.native
    
    def setHidden(state: Boolean): Unit = js.native
    
    def setText(text: String): Unit = js.native
    
    val x: Double = js.native
    
    val y: Double = js.native
  }
}
