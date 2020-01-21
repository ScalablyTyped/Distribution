package typings.testingLibraryJestDom

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.std.RegExp
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jest")
@js.native
object jest extends js.Object {
  @js.native
  trait Matchers[R, T] extends js.Object {
    def toBeChecked(): R = js.native
    def toBeDisabled(): R = js.native
    def toBeEmpty(): R = js.native
    def toBeEnabled(): R = js.native
    /**
      * @deprecated
      */
    def toBeInTheDOM(): R = js.native
    def toBeInTheDOM(container: HTMLElement): R = js.native
    def toBeInTheDOM(container: SVGElement): R = js.native
    def toBeInTheDocument(): R = js.native
    def toBeInvalid(): R = js.native
    def toBeRequired(): R = js.native
    def toBeValid(): R = js.native
    def toBeVisible(): R = js.native
    def toContainElement(): R = js.native
    def toContainElement(element: HTMLElement): R = js.native
    def toContainElement(element: SVGElement): R = js.native
    def toContainHTML(htmlText: String): R = js.native
    def toHaveAttribute(attr: String): R = js.native
    def toHaveAttribute(attr: String, value: js.Any): R = js.native
    def toHaveClass(classNames: String*): R = js.native
    def toHaveFocus(): R = js.native
    def toHaveFormValues(expectedValues: StringDictionary[js.Any]): R = js.native
    def toHaveStyle(css: String): R = js.native
    def toHaveTextContent(text: String): R = js.native
    def toHaveTextContent(text: String, options: AnonNormalizeWhitespace): R = js.native
    def toHaveTextContent(text: RegExp): R = js.native
    def toHaveTextContent(text: RegExp, options: AnonNormalizeWhitespace): R = js.native
    def toHaveValue(): R = js.native
    def toHaveValue(value: String): R = js.native
    def toHaveValue(value: js.Array[String]): R = js.native
    def toHaveValue(value: Double): R = js.native
  }
  
}

