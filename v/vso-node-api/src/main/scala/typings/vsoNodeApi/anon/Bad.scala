package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bad extends StObject {
  
  var bad: scala.Double
  
  var blob: scala.Double
  
  var commit: scala.Double
  
  var ext2: scala.Double
  
  var ofsDelta: scala.Double
  
  var refDelta: scala.Double
  
  var tag: scala.Double
  
  var tree: scala.Double
}
object Bad {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Bad] (val x: Self) extends AnyVal {
    
    inline def setBad(value: scala.Double): Self = StObject.set(x, "bad", value.asInstanceOf[js.Any])
    
    inline def setBlob(value: scala.Double): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: scala.Double): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setExt2(value: scala.Double): Self = StObject.set(x, "ext2", value.asInstanceOf[js.Any])
    
    inline def setOfsDelta(value: scala.Double): Self = StObject.set(x, "ofsDelta", value.asInstanceOf[js.Any])
    
    inline def setRefDelta(value: scala.Double): Self = StObject.set(x, "refDelta", value.asInstanceOf[js.Any])
    
    inline def setTag(value: scala.Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTree(value: scala.Double): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
  }
}
