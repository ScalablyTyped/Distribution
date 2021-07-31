package typings.yamljs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yamljs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def load(path: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def load(path: String, callback: js.Function1[/* res */ js.Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def parse(yamlString: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(yamlString.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def stringify(nativeObject: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(nativeObject.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(nativeObject: js.Any, `inline`: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(nativeObject.asInstanceOf[js.Any], `inline`.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(nativeObject: js.Any, `inline`: Double, spaces: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(nativeObject.asInstanceOf[js.Any], `inline`.asInstanceOf[js.Any], spaces.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(nativeObject: js.Any, `inline`: Unit, spaces: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(nativeObject.asInstanceOf[js.Any], `inline`.asInstanceOf[js.Any], spaces.asInstanceOf[js.Any])).asInstanceOf[String]
}
