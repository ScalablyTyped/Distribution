package typings.xmlcreate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("xmlcreate/lib/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fixChar(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixChar")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def fixName(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixName")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isUndefined(`val`: js.Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  @scala.inline
  def validateChar(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateChar")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def validateName(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateName")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def validateSingleChar(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSingleChar")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
