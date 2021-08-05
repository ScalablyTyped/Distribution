package typings.yayson

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.yayson.anon.TypeofPresenter
import typings.yayson.yaysonStrings.default
import typings.yayson.yaysonStrings.sequelize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Yayson = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Yayson]
  inline def apply(arg: YaysonOptions): Yayson = ^.asInstanceOf[js.Dynamic].apply(arg.asInstanceOf[js.Any]).asInstanceOf[Yayson]
  
  @JSImport("yayson", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Adapter extends StObject {
    
    def get(model: js.Object): js.Any = js.native
    def get(model: js.Object, key: String): js.Any = js.native
    
    def id(model: js.Object): String = js.native
  }
  
  trait JsonOptions
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var meta: js.UndefOr[js.Object] = js.undefined
  }
  object JsonOptions {
    
    inline def apply(): JsonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonOptions]
    }
    
    extension [Self <: JsonOptions](x: Self) {
      
      inline def setMeta(value: js.Object): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
  
  @js.native
  trait Presenter extends StObject {
    
    def id(instance: js.Object): String = js.native
    
    def render(instanceOrCollection: js.Object): js.Any = js.native
    def render(instanceOrCollection: js.Object, options: JsonOptions): js.Any = js.native
    def render[T](instanceOrCollection: js.Thenable[T]): js.Thenable[T] = js.native
    def render[T](instanceOrCollection: js.Thenable[T], options: JsonOptions): js.Thenable[T] = js.native
    
    def toJSON(instanceOrCollection: js.Object): js.Any = js.native
    def toJSON(instanceOrCollection: js.Object, options: JsonOptions): js.Any = js.native
    
    var `type`: String = js.native
  }
  
  trait Record extends StObject {
    
    var attributes: js.Any
    
    var id: js.Any
    
    var relationships: js.Any
    
    var `type`: String
  }
  object Record {
    
    inline def apply(attributes: js.Any, id: js.Any, relationships: js.Any, `type`: String): Record = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Record]
    }
    
    extension [Self <: Record](x: Self) {
      
      inline def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRelationships(value: js.Any): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Store extends StObject {
    
    def find(`type`: String, id: String): js.Any = js.native
    
    def findAll(`type`: String): js.Array[js.Any] = js.native
    
    var records: js.Array[Record] = js.native
    
    var relations: StringDictionary[js.Any] = js.native
    
    def remove(`type`: String): Unit = js.native
    def remove(`type`: String, id: String): Unit = js.native
    
    def reset(): Unit = js.native
    
    def sync(obj: js.Object): js.Any = js.native
  }
  
  trait Yayson extends StObject {
    
    var Adapter: typings.yayson.mod.Adapter
    
    var Presenter: TypeofPresenter & Instantiable0[typings.yayson.mod.Presenter]
    
    var Store: Instantiable0[typings.yayson.mod.Store]
  }
  object Yayson {
    
    inline def apply(
      Adapter: Adapter,
      Presenter: TypeofPresenter & Instantiable0[Presenter],
      Store: Instantiable0[Store]
    ): Yayson = {
      val __obj = js.Dynamic.literal(Adapter = Adapter.asInstanceOf[js.Any], Presenter = Presenter.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Yayson]
    }
    
    extension [Self <: Yayson](x: Self) {
      
      inline def setAdapter(value: Adapter): Self = StObject.set(x, "Adapter", value.asInstanceOf[js.Any])
      
      inline def setPresenter(value: TypeofPresenter & Instantiable0[Presenter]): Self = StObject.set(x, "Presenter", value.asInstanceOf[js.Any])
      
      inline def setStore(value: Instantiable0[Store]): Self = StObject.set(x, "Store", value.asInstanceOf[js.Any])
    }
  }
  
  trait YaysonOptions extends StObject {
    
    var adapter: js.UndefOr[default | sequelize] = js.undefined
  }
  object YaysonOptions {
    
    inline def apply(): YaysonOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YaysonOptions]
    }
    
    extension [Self <: YaysonOptions](x: Self) {
      
      inline def setAdapter(value: default | sequelize): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
    }
  }
}
