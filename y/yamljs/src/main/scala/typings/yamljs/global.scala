package typings.yamljs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object YAML {
    
    @JSGlobal("YAML")
    @js.native
    val ^ : js.Any = js.native
    
    inline def load(path: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def load(path: String, callback: js.Function1[/* res */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def parse(yamlString: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(yamlString.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def stringify(nativeObject: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(nativeObject.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def stringify(nativeObject: Any, `inline`: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(nativeObject.asInstanceOf[js.Any], `inline`.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(nativeObject: Any, `inline`: Double, spaces: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(nativeObject.asInstanceOf[js.Any], `inline`.asInstanceOf[js.Any], spaces.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def stringify(nativeObject: Any, `inline`: Unit, spaces: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(nativeObject.asInstanceOf[js.Any], `inline`.asInstanceOf[js.Any], spaces.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
