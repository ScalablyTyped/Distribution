package typings.xmlCore

import typings.xmlCore.typesMod.ICollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionMod {
  
  @JSImport("xml-core/dist/types/collection", "Collection")
  @js.native
  open class Collection[I] ()
    extends StObject
       with ICollection[I] {
    def this(items: js.Array[I]) = this()
    
    /* CompleteClass */
    override def Add(item: I): Unit = js.native
    
    /* CompleteClass */
    override def Clear(): Unit = js.native
    
    /* CompleteClass */
    override val Count: Double = js.native
    @JSName("Count")
    def Count_MCollection: Double = js.native
    
    /* CompleteClass */
    override def Every(cb: js.Function3[I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean = js.native
    
    /* CompleteClass */
    override def Filter(cb: js.Function3[I, /* index */ Double, /* array */ js.Array[I], Boolean]): ICollection[I] = js.native
    
    /* CompleteClass */
    override def ForEach(cb: js.Function3[I, /* index */ Double, /* array */ js.Array[I], Unit]): Unit = js.native
    
    /* CompleteClass */
    override def GetIterator(): js.Array[I] = js.native
    
    /* CompleteClass */
    override def IsEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def Item(index: Double): I | Null = js.native
    
    /* CompleteClass */
    override def Map[U](cb: js.Function3[I, /* index */ Double, /* array */ js.Array[I], U]): ICollection[U] = js.native
    
    /* CompleteClass */
    override def Pop(): js.UndefOr[I] = js.native
    
    /* CompleteClass */
    override def RemoveAt(index: Double): Unit = js.native
    
    /* CompleteClass */
    override def Some(cb: js.Function3[I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean = js.native
    
    /* CompleteClass */
    override def Sort(cb: js.Function2[I, I, Double]): ICollection[I] = js.native
    
    /* protected */ var items: js.Array[I] = js.native
  }
}
