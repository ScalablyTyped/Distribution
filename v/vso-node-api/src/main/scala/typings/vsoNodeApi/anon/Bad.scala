package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bad extends StObject {
  
  var bad: scala.Double = js.native
  
  var blob: scala.Double = js.native
  
  var commit: scala.Double = js.native
  
  var ext2: scala.Double = js.native
  
  var ofsDelta: scala.Double = js.native
  
  var refDelta: scala.Double = js.native
  
  var tag: scala.Double = js.native
  
  var tree: scala.Double = js.native
}
object Bad {
  
  @scala.inline
  def apply(
    bad: scala.Double,
    blob: scala.Double,
    commit: scala.Double,
    ext2: scala.Double,
    ofsDelta: scala.Double,
    refDelta: scala.Double,
    tag: scala.Double,
    tree: scala.Double
  ): Bad = {
    val __obj = js.Dynamic.literal(bad = bad.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], ext2 = ext2.asInstanceOf[js.Any], ofsDelta = ofsDelta.asInstanceOf[js.Any], refDelta = refDelta.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bad]
  }
  
  @scala.inline
  implicit class BadMutableBuilder[Self <: Bad] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBad(value: scala.Double): Self = StObject.set(x, "bad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlob(value: scala.Double): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: scala.Double): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExt2(value: scala.Double): Self = StObject.set(x, "ext2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfsDelta(value: scala.Double): Self = StObject.set(x, "ofsDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefDelta(value: scala.Double): Self = StObject.set(x, "refDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: scala.Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTree(value: scala.Double): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
  }
}
