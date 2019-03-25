package typings
package webdriverDashManagerLib.distLibProviderChromedriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webdriver-manager/dist/lib/provider/chromedriver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def formatVersion(version: java.lang.String): java.lang.String | scala.Null = js.native
  def matchBinaries(ostype: java.lang.String): stdLib.RegExp | scala.Null = js.native
  def osHelper(ostype: java.lang.String, osarch: java.lang.String): java.lang.String = js.native
  def semanticVersionParser(xmlKey: java.lang.String): java.lang.String | scala.Null = js.native
  def versionParser(xmlKey: java.lang.String): java.lang.String = js.native
}

