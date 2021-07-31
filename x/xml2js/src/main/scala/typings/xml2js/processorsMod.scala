package typings.xml2js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object processorsMod {
  
  @JSImport("xml2js/lib/processors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def firstCharLowerCase(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("firstCharLowerCase")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def normalize(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def parseBooleans(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBooleans")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def parseNumbers(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseNumbers")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def stripPrefix(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripPrefix")(name.asInstanceOf[js.Any]).asInstanceOf[String]
}
