package typings.tar.mod

import org.scalablytyped.runtime.Instantiable1
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MiniPass * / any */ @JSImport("tar", "Pack")
@js.native
open class Pack () extends StObject {
  def this(opt: PackOptions) = this()
  
  def add(path: String): this.type = js.native
  
  var linkCache: js.UndefOr[Map[String, String]] = js.native
  
  var readdirCache: js.UndefOr[Map[String, String]] = js.native
  
  var statCache: js.UndefOr[Map[String, String]] = js.native
}
/* static members */
object Pack {
  
  @JSImport("tar", "Pack")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tar", "Pack.Sync")
  @js.native
  def Sync: Instantiable1[/* opt */ PackOptions, PackSync] = js.native
  inline def Sync_=(x: Instantiable1[/* opt */ PackOptions, PackSync]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Sync")(x.asInstanceOf[js.Any])
}
