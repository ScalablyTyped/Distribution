package typings.unified

import typings.unified.mod.FrozenProcessor
import typings.unist.mod.Data
import typings.vfile.libMod.Compatible
import typings.vfile.mod.VFile
import typings.vfile.mod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("unified/lib", "unified")
  @js.native
  val unified: FrozenProcessor[Unit, Unit, Unit, Unit] = js.native
  
  type Compiler = typings.unified.mod.Compiler[typings.unist.mod.Node[Data], Any]
  
  trait Context extends StObject {
    
    var file: VFile
    
    var tree: Node
  }
  object Context {
    
    inline def apply(file: VFile, tree: Node): Context = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setFile(value: VFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setTree(value: Node): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    }
  }
  
  type Node = typings.unist.mod.Node[Data]
  
  type Parser = typings.unified.mod.Parser[typings.unist.mod.Node[Data]]
  
  type Pluggable = typings.unified.mod.Pluggable[js.Array[Any]]
  
  type PluggableList = typings.unified.mod.PluggableList
  
  type Plugin = typings.unified.mod.Plugin[js.Array[Any], typings.unist.mod.Node[Data], typings.unist.mod.Node[Data]]
  
  type Preset = typings.unified.mod.Preset
  
  type ProcessCallback = typings.unified.mod.ProcessCallback[VFile]
  
  type Processor = typings.unified.mod.Processor[Unit, Unit, Unit, Unit]
  
  type RunCallback = typings.unified.mod.RunCallback[typings.unist.mod.Node[Data]]
  
  type Transformer = typings.unified.mod.Transformer[typings.unist.mod.Node[Data], typings.unist.mod.Node[Data]]
  
  type VFileCompatible = Compatible
  
  type VFileValue = Value
}
