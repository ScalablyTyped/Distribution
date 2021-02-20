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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textBufferMod {
  
  @JSImport("terminal-kit/TextBuffer", JSImport.Namespace)
  @js.native
  class ^ protected () extends TextBuffer {
    def this(options: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var dst: typings.terminalKit.screenBufferMod.^ = js.native
    
    var forceInBound: js.UndefOr[Double] = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var tabWidth: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var wrap: js.UndefOr[Boolean] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(dst: typings.terminalKit.screenBufferMod.^): Options = {
      val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDst(value: typings.terminalKit.screenBufferMod.^): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceInBound(value: Double): Self = StObject.set(x, "forceInBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceInBoundUndefined: Self = StObject.set(x, "forceInBound", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
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
