package typings
package toughDashCookieDashFileDashStoreLib.toughDashCookieDashFileDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileCookieStore
  extends toughDashCookieLib.toughDashCookieMod.Store {
  var filePath: java.lang.String = js.native
  var idx: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[
      org.scalablytyped.runtime.StringDictionary[toughDashCookieLib.toughDashCookieMod.Cookie]
    ]
  ] = js.native
  var synchronous: scala.Boolean = js.native
  def checkExpired(): scala.Boolean = js.native
  def checkExpired(domain: java.lang.String): scala.Boolean = js.native
  def checkExpired(domain: java.lang.String, path: java.lang.String): scala.Boolean = js.native
  def checkExpired(domain: java.lang.String, path: java.lang.String, key: java.lang.String): scala.Boolean = js.native
  def checkExpired(domain: java.lang.String, path: scala.Null, key: java.lang.String): scala.Boolean = js.native
  def checkExpired(domain: scala.Null, path: java.lang.String): scala.Boolean = js.native
  def checkExpired(domain: scala.Null, path: java.lang.String, key: java.lang.String): scala.Boolean = js.native
  def checkExpired(domain: scala.Null, path: scala.Null, key: java.lang.String): scala.Boolean = js.native
  def inspect(): java.lang.String = js.native
  def isEmpty(): scala.Boolean = js.native
  def isExpired(): scala.Boolean = js.native
}

