package typings.wallabyjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wallabyjsMod {
  type IWallabyBuiltInCompilerOptions = StringDictionary[String]
  type IWallabyCompilers = StringDictionary[js.Any]
  type IWallabyProcessor = StringDictionary[js.Function1[/* file */ IWallabyFile, Unit]]
}
