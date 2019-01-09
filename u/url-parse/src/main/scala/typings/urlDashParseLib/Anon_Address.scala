package typings
package urlDashParseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Address
  extends org.scalablytyped.runtime.Instantiable2[
      /* address */ java.lang.String, 
      (/* parser */ scala.Boolean) | (/* location */ js.Object) | (/* parser */ urlDashParseLib.urlDashParseMod.URLParseNs.QueryParser) | (/* location */ java.lang.String), 
      urlDashParseLib.urlDashParseMod.URLParse
    ]
     with org.scalablytyped.runtime.Instantiable1[/* address */ java.lang.String, urlDashParseLib.urlDashParseMod.URLParse]
     with org.scalablytyped.runtime.Instantiable3[
      /* address */ java.lang.String, 
      (/* location */ js.Object) | (/* location */ java.lang.String), 
      (/* parser */ scala.Boolean) | (/* parser */ urlDashParseLib.urlDashParseMod.URLParseNs.QueryParser), 
      urlDashParseLib.urlDashParseMod.URLParse
    ] {
  var qs: Anon_Parse = js.native
  def apply(address: java.lang.String): urlDashParseLib.urlDashParseMod.URLParse = js.native
  def apply(address: java.lang.String, location: java.lang.String): urlDashParseLib.urlDashParseMod.URLParse = js.native
  def apply(address: java.lang.String, location: java.lang.String, parser: scala.Boolean): urlDashParseLib.urlDashParseMod.URLParse = js.native
  def apply(
    address: java.lang.String,
    location: java.lang.String,
    parser: urlDashParseLib.urlDashParseMod.URLParseNs.QueryParser
  ): urlDashParseLib.urlDashParseMod.URLParse = js.native
  def apply(address: java.lang.String, location: js.Object): urlDashParseLib.urlDashParseMod.URLParse = js.native
  def apply(address: java.lang.String, location: js.Object, parser: scala.Boolean): urlDashParseLib.urlDashParseMod.URLParse = js.native
  def apply(
    address: java.lang.String,
    location: js.Object,
    parser: urlDashParseLib.urlDashParseMod.URLParseNs.QueryParser
  ): urlDashParseLib.urlDashParseMod.URLParse = js.native
  def apply(address: java.lang.String, parser: scala.Boolean): urlDashParseLib.urlDashParseMod.URLParse = js.native
  def apply(address: java.lang.String, parser: urlDashParseLib.urlDashParseMod.URLParseNs.QueryParser): urlDashParseLib.urlDashParseMod.URLParse = js.native
  def extractProtocol(url: java.lang.String): Anon_Protocol = js.native
  def location(url: java.lang.String): js.Object = js.native
}

