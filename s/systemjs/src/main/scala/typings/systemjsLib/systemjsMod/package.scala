package typings
package systemjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object systemjsMod {
  type ConfigMap = PackageList[java.lang.String | PackageList[java.lang.String]]
  type ConfigMeta = PackageList[MetaConfig]
  type ModulesList = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type PackageList[T] = org.scalablytyped.runtime.StringDictionary[T]
}
