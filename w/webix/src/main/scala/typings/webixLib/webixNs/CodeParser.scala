package typings
package webixLib.webixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CodeParser extends js.Object {
  def collapseNames(obj: js.Any): ScalablyTyped.runtime.StringDictionary[js.Any]
  def expandNames(obj: ScalablyTyped.runtime.StringDictionary[js.Any]): js.Any
}

