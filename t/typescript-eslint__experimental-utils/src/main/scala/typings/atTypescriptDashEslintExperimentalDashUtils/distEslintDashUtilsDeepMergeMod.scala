package typings.atTypescriptDashEslintExperimentalDashUtils

import typings.atTypescriptDashEslintExperimentalDashUtils.distEslintDashUtilsDeepMergeMod.ObjectLike
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/experimental-utils/dist/eslint-utils/deepMerge", JSImport.Namespace)
@js.native
object distEslintDashUtilsDeepMergeMod extends js.Object {
  def deepMerge(): Record[String, _] = js.native
  def deepMerge(first: ObjectLike[_]): Record[String, _] = js.native
  def deepMerge(first: ObjectLike[_], second: ObjectLike[_]): Record[String, _] = js.native
  def isObjectNotArray[T /* <: js.Object */](obj: T): /* is T */ Boolean = js.native
  def isObjectNotArray[T /* <: js.Object */](obj: js.Array[_]): /* is T */ Boolean = js.native
  type ObjectLike[T] = Record[String, T]
}

