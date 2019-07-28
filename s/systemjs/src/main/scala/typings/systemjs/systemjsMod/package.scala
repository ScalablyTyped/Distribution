package typings.systemjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object systemjsMod {
  type ConfigMap = PackageList[String | PackageList[String]]
  type ConfigMeta = PackageList[MetaConfig]
  type ModulesList = StringDictionary[js.Array[String]]
  type PackageList[T] = StringDictionary[T]
}
