package typings.webcola

import typings.webcola.anon.Groups
import typings.webcola.distSrcLinklengthsMod.LinkAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPowergraphMod {
  
  @JSImport("webcola/dist/src/powergraph", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webcola/dist/src/powergraph", "Configuration")
  @js.native
  open class Configuration[Link] protected () extends StObject {
    def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link]) = this()
    def this(n: Double, edges: js.Array[Link], linkAccessor: LinkTypeAccessor[Link], rootGroup: js.Array[Any]) = this()
    
    var R: Double = js.native
    
    def allEdges(): js.Array[PowerEdge] = js.native
    
    def getGroupHierarchy(retargetedEdges: js.Array[PowerEdge]): js.Array[Any] = js.native
    
    def greedyMerge(): Boolean = js.native
    
    /* private */ var initModulesFromGroup: Any = js.native
    
    /* private */ var linkAccessor: Any = js.native
    
    def merge(a: Module, b: Module): Module = js.native
    def merge(a: Module, b: Module, k: Double): Module = js.native
    
    var modules: js.Array[Module] = js.native
    
    /* private */ var nEdges: Any = js.native
    
    /* private */ var rootMerges: Any = js.native
    
    var roots: js.Array[ModuleSet] = js.native
  }
  /* static members */
  object Configuration {
    
    @JSImport("webcola/dist/src/powergraph", "Configuration")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getEdges(modules: ModuleSet, es: js.Array[PowerEdge]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getEdges")(modules.asInstanceOf[js.Any], es.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("webcola/dist/src/powergraph", "LinkSets")
  @js.native
  open class LinkSets () extends StObject {
    
    def add(linktype: Double, m: Module): Unit = js.native
    
    def contains(id: Double): Boolean = js.native
    
    def count(): Double = js.native
    
    def forAll(f: js.Function2[/* ms */ ModuleSet, /* linktype */ Double, Unit]): Unit = js.native
    
    def forAllModules(f: js.Function1[/* m */ Module, Unit]): Unit = js.native
    
    def intersection(other: LinkSets): LinkSets = js.native
    
    var n: Double = js.native
    
    def remove(linktype: Double, m: Module): Unit = js.native
    
    var sets: Any = js.native
  }
  
  @JSImport("webcola/dist/src/powergraph", "Module")
  @js.native
  open class Module protected () extends StObject {
    def this(id: Double) = this()
    def this(id: Double, outgoing: LinkSets) = this()
    def this(id: Double, outgoing: Unit, incoming: LinkSets) = this()
    def this(id: Double, outgoing: LinkSets, incoming: LinkSets) = this()
    def this(id: Double, outgoing: Unit, incoming: Unit, children: ModuleSet) = this()
    def this(id: Double, outgoing: Unit, incoming: LinkSets, children: ModuleSet) = this()
    def this(id: Double, outgoing: LinkSets, incoming: Unit, children: ModuleSet) = this()
    def this(id: Double, outgoing: LinkSets, incoming: LinkSets, children: ModuleSet) = this()
    def this(id: Double, outgoing: Unit, incoming: Unit, children: Unit, definition: Any) = this()
    def this(id: Double, outgoing: Unit, incoming: Unit, children: ModuleSet, definition: Any) = this()
    def this(id: Double, outgoing: Unit, incoming: LinkSets, children: Unit, definition: Any) = this()
    def this(id: Double, outgoing: Unit, incoming: LinkSets, children: ModuleSet, definition: Any) = this()
    def this(id: Double, outgoing: LinkSets, incoming: Unit, children: Unit, definition: Any) = this()
    def this(id: Double, outgoing: LinkSets, incoming: Unit, children: ModuleSet, definition: Any) = this()
    def this(id: Double, outgoing: LinkSets, incoming: LinkSets, children: Unit, definition: Any) = this()
    def this(id: Double, outgoing: LinkSets, incoming: LinkSets, children: ModuleSet, definition: Any) = this()
    
    var children: ModuleSet = js.native
    
    var definition: js.UndefOr[Any] = js.native
    
    def getEdges(es: js.Array[PowerEdge]): Unit = js.native
    
    var gid: Double = js.native
    
    var id: Double = js.native
    
    var incoming: LinkSets = js.native
    
    def isIsland(): Boolean = js.native
    
    def isLeaf(): Boolean = js.native
    
    def isPredefined(): Boolean = js.native
    
    var outgoing: LinkSets = js.native
  }
  
  @JSImport("webcola/dist/src/powergraph", "ModuleSet")
  @js.native
  open class ModuleSet () extends StObject {
    
    def add(m: Module): Unit = js.native
    
    def contains(id: Double): Boolean = js.native
    
    def count(): Double = js.native
    
    def forAll(f: js.Function1[/* m */ Module, Unit]): Unit = js.native
    
    def intersection(other: ModuleSet): ModuleSet = js.native
    
    def intersectionCount(other: ModuleSet): Double = js.native
    
    def modules(): js.Array[Module] = js.native
    
    def remove(m: Module): Unit = js.native
    
    var table: Any = js.native
  }
  
  @JSImport("webcola/dist/src/powergraph", "PowerEdge")
  @js.native
  open class PowerEdge protected () extends StObject {
    def this(source: Any, target: Any, `type`: Double) = this()
    
    var source: Any = js.native
    
    var target: Any = js.native
    
    var `type`: Double = js.native
  }
  
  inline def getGroups[Link](nodes: js.Array[Any], links: js.Array[Link], la: LinkTypeAccessor[Link]): Groups = (^.asInstanceOf[js.Dynamic].applyDynamic("getGroups")(nodes.asInstanceOf[js.Any], links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[Groups]
  inline def getGroups[Link](nodes: js.Array[Any], links: js.Array[Link], la: LinkTypeAccessor[Link], rootGroup: js.Array[Any]): Groups = (^.asInstanceOf[js.Dynamic].applyDynamic("getGroups")(nodes.asInstanceOf[js.Any], links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], rootGroup.asInstanceOf[js.Any])).asInstanceOf[Groups]
  
  trait LinkTypeAccessor[Link]
    extends StObject
       with LinkAccessor[Link] {
    
    def getType(l: Link): Double
  }
  object LinkTypeAccessor {
    
    inline def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double, getType: Link => Double): LinkTypeAccessor[Link] = {
      val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), getType = js.Any.fromFunction1(getType))
      __obj.asInstanceOf[LinkTypeAccessor[Link]]
    }
    
    extension [Self <: LinkTypeAccessor[?], Link](x: Self & LinkTypeAccessor[Link]) {
      
      inline def setGetType(value: Link => Double): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
    }
  }
}
