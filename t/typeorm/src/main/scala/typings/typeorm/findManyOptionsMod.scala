package typings.typeorm

import typings.typeorm.findOneOptionsMod.FindOneOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findManyOptionsMod {
  
  trait FindManyOptions[Entity]
    extends StObject
       with FindOneOptions[Entity] {
    
    /**
      * Offset (paginated) where from entities should be taken.
      */
    var skip: js.UndefOr[Double] = js.undefined
    
    /**
      * Limit (paginated) - max number of entities should be taken.
      */
    var take: js.UndefOr[Double] = js.undefined
  }
  object FindManyOptions {
    
    @scala.inline
    def apply[Entity](): FindManyOptions[Entity] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindManyOptions[Entity]]
    }
    
    @scala.inline
    implicit class FindManyOptionsMutableBuilder[Self <: FindManyOptions[?], Entity] (val x: Self & FindManyOptions[Entity]) extends AnyVal {
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
      
      @scala.inline
      def setTake(value: Double): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTakeUndefined: Self = StObject.set(x, "take", js.undefined)
    }
  }
}
