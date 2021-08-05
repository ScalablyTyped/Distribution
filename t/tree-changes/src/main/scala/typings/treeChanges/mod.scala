package typings.treeChanges

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tree-changes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: IData, nextData: IData): ITreeChanges = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], nextData.asInstanceOf[js.Any])).asInstanceOf[ITreeChanges]
  
  type IData = IPlainObject | js.Array[IPlainObject]
  
  type IPlainObject = StringDictionary[js.Any]
  
  @js.native
  trait ITreeChanges extends StObject {
    
    def changed(): Boolean = js.native
    def changed(key: String): Boolean = js.native
    def changed(key: Double): Boolean = js.native
    
    def changedFrom(key: String, previous: TypeInput): Boolean = js.native
    def changedFrom(key: String, previous: TypeInput, actual: TypeInput): Boolean = js.native
    def changedFrom(key: Double, previous: TypeInput): Boolean = js.native
    def changedFrom(key: Double, previous: TypeInput, actual: TypeInput): Boolean = js.native
    
    def changedTo(key: String, actual: TypeInput): Boolean = js.native
    def changedTo(key: Double, actual: TypeInput): Boolean = js.native
    
    def decreased(key: String): Boolean = js.native
    def decreased(key: Double): Boolean = js.native
    
    def increased(key: String): Boolean = js.native
    def increased(key: Double): Boolean = js.native
  }
  
  type TypeInput = String | Boolean | Double | IPlainObject | (js.Array[String | Boolean | Double | IPlainObject])
}
