package typings.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable3
import typings.yandexMaps.mod.IOptionManager
import typings.yandexMaps.mod.option.Manager
import typings.yandexMaps.mod.util.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofoption extends StObject {
  
  var Manager: Instantiable3[
    /* options */ js.UndefOr[js.Object], 
    /* parent */ js.UndefOr[IOptionManager], 
    /* name */ js.UndefOr[String], 
    typings.yandexMaps.mod.option.Manager
  ]
  
  val presetStorage: Storage
}
object Typeofoption {
  
  inline def apply(
    Manager: Instantiable3[
      /* options */ js.UndefOr[js.Object], 
      /* parent */ js.UndefOr[IOptionManager], 
      /* name */ js.UndefOr[String], 
      Manager
    ],
    presetStorage: Storage
  ): Typeofoption = {
    val __obj = js.Dynamic.literal(Manager = Manager.asInstanceOf[js.Any], presetStorage = presetStorage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoption]
  }
  
  extension [Self <: Typeofoption](x: Self) {
    
    inline def setManager(
      value: Instantiable3[
          /* options */ js.UndefOr[js.Object], 
          /* parent */ js.UndefOr[IOptionManager], 
          /* name */ js.UndefOr[String], 
          Manager
        ]
    ): Self = StObject.set(x, "Manager", value.asInstanceOf[js.Any])
    
    inline def setPresetStorage(value: Storage): Self = StObject.set(x, "presetStorage", value.asInstanceOf[js.Any])
  }
}
