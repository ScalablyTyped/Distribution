package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webdriverLib {
  type ArgumentTypes[T] = js.Any
  type AsyncClient = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof webdriver.WebDriver.Client ]: webdriver.WrapWithPromise<webdriver.WebDriver.Client[K]>}
    */ webdriverLib.webdriverLibStrings.AsyncClient with webdriverLib.WebDriverNs.Client
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type WrapWithPromise[T] = js.Function1[/* args */ ArgumentTypes[T], js.Promise[T]]
}
