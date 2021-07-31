package typings.wixUiCore

import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationDotPrivateDriverMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/pagination/Pagination.private.driver", "PaginationDriver")
  @js.native
  class PaginationDriver protected () extends StObject {
    def this(root: HTMLElement) = this()
    
    def changeInput(value: js.Any): Unit = js.native
    
    def commitInput(): Unit = js.native
    
    def currentPage: Element = js.native
    
    def firstButton: Element = js.native
    
    def getPage(n: js.Any): Element = js.native
    
    def input: HTMLInputElement = js.native
    
    def lastButton: Element = js.native
    
    def nextButton: Element = js.native
    
    def pageCompact: Element = js.native
    
    def pageLabels: js.Array[String] = js.native
    
    def pageStrip: Element = js.native
    
    def pages: js.Array[Element] = js.native
    
    def previousButton: Element = js.native
    
    var root: HTMLElement = js.native
    
    def slashLabel: Element = js.native
    
    def totalPagesLabel: Element = js.native
  }
}
