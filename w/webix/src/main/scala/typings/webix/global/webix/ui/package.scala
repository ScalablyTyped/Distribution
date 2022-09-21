package typings.webix.global.webix.ui

import typings.webix.global.webix.ui.^
import typings.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(config: Any): baseview = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[baseview]
inline def apply(config: Any, parent: Any): baseview = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[baseview]
inline def apply(config: Any, parent: Any, replacement: Any): baseview = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[baseview]
inline def apply(config: Any, parent: Unit, replacement: Any): baseview = (^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replacement.asInstanceOf[js.Any])).asInstanceOf[baseview]

inline def delay(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("delay")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def fullScreen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fullScreen")().asInstanceOf[Unit]

inline def hasMethod(name: String, method_name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasMethod")(name.asInstanceOf[js.Any], method_name.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def resize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resize")().asInstanceOf[Unit]

inline def scrollSize: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("scrollSize").asInstanceOf[Double]
inline def scrollSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollSize")(x.asInstanceOf[js.Any])

inline def zIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("zIndex")().asInstanceOf[Double]

inline def zIndexBase: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("zIndexBase").asInstanceOf[Double]
inline def zIndexBase_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndexBase")(x.asInstanceOf[js.Any])
