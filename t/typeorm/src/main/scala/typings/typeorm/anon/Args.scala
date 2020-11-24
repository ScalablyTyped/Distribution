package typings.typeorm.anon

import typings.typeorm.tableMetadataArgsMod.TableMetadataArgs
import typings.typeorm.treeMetadataArgsMod.TreeMetadataArgs
import typings.typeorm.typeormStrings.STI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Args extends js.Object {
  
  var args: TableMetadataArgs = js.native
  
  var connection: typings.typeorm.connectionMod.Connection = js.native
  
  var inheritancePattern: js.UndefOr[STI] = js.native
  
  var inheritanceTree: js.UndefOr[js.Array[js.Function]] = js.native
  
  var parentClosureEntityMetadata: js.UndefOr[typings.typeorm.entityMetadataMod.EntityMetadata] = js.native
  
  var tableTree: js.UndefOr[TreeMetadataArgs] = js.native
}
object Args {
  
  @scala.inline
  def apply(args: TableMetadataArgs, connection: typings.typeorm.connectionMod.Connection): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgs(value: TableMetadataArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection(value: typings.typeorm.connectionMod.Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritancePattern(value: STI): Self = this.set("inheritancePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritancePattern: Self = this.set("inheritancePattern", js.undefined)
    
    @scala.inline
    def setInheritanceTreeVarargs(value: js.Function*): Self = this.set("inheritanceTree", js.Array(value :_*))
    
    @scala.inline
    def setInheritanceTree(value: js.Array[js.Function]): Self = this.set("inheritanceTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritanceTree: Self = this.set("inheritanceTree", js.undefined)
    
    @scala.inline
    def setParentClosureEntityMetadata(value: typings.typeorm.entityMetadataMod.EntityMetadata): Self = this.set("parentClosureEntityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentClosureEntityMetadata: Self = this.set("parentClosureEntityMetadata", js.undefined)
    
    @scala.inline
    def setTableTree(value: TreeMetadataArgs): Self = this.set("tableTree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableTree: Self = this.set("tableTree", js.undefined)
  }
}
