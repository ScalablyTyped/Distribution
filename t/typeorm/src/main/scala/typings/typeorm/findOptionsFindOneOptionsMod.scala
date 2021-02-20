package typings.typeorm

import org.scalablytyped.runtime.TopLevel
import typings.typeorm.anon.DisableMixedMap
import typings.typeorm.anon.Milliseconds
import typings.typeorm.anon.Mode
import typings.typeorm.anon.`2`
import typings.typeorm.commonObjectLiteralMod.ObjectLiteral
import typings.typeorm.findOptionsFindConditionsMod.FindConditions
import typings.typeorm.findOptionsJoinOptionsMod.JoinOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findOptionsFindOneOptionsMod {
  
  @js.native
  trait FindOneOptions[Entity] extends StObject {
    
    /**
      * Enables or disables query result caching.
      */
    var cache: js.UndefOr[Boolean | Double | Milliseconds] = js.native
    
    /**
      * Specifies what relations should be loaded.
      */
    var join: js.UndefOr[JoinOptions] = js.native
    
    /**
      * Indicates if eager relations should be loaded or not.
      * By default they are loaded when find methods are used.
      */
    var loadEagerRelations: js.UndefOr[Boolean] = js.native
    
    /**
      * If sets to true then loads all relation ids of the entity and maps them into relation values (not relation objects).
      * If array of strings is given then loads only relation ids of the given properties.
      */
    var loadRelationIds: js.UndefOr[Boolean | DisableMixedMap] = js.native
    
    /**
      * Indicates what locking mode should be used.
      */
    var lock: js.UndefOr[Mode | `2`] = js.native
    
    /**
      * Order, in which entities should be ordered.
      */
    var order: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof Entity ]:? 'ASC' | 'DESC' | 1 | -1}
      */ typings.typeorm.typeormStrings.FindOneOptions with TopLevel[js.Any]
      ] = js.native
    
    /**
      * Indicates what relations of entity should be loaded (simplified left join form).
      */
    var relations: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Specifies what columns should be retrieved.
      */
    var select: js.UndefOr[js.Array[/* keyof Entity */ String]] = js.native
    
    /**
      * If this is set to true, SELECT query in a `find` method will be executed in a transaction.
      */
    var transaction: js.UndefOr[Boolean] = js.native
    
    /**
      * Simple condition that should be applied to match entities.
      */
    var where: js.UndefOr[
        js.Array[FindConditions[Entity]] | FindConditions[Entity] | ObjectLiteral | String
      ] = js.native
    
    /**
      * Indicates if soft-deleted rows should be included in entity result.
      */
    var withDeleted: js.UndefOr[Boolean] = js.native
  }
  object FindOneOptions {
    
    @scala.inline
    def apply[Entity](): FindOneOptions[Entity] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindOneOptions[Entity]]
    }
    
    @scala.inline
    implicit class FindOneOptionsMutableBuilder[Self <: FindOneOptions[_], Entity] (val x: Self with FindOneOptions[Entity]) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean | Double | Milliseconds): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setJoin(value: JoinOptions): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      @scala.inline
      def setLoadEagerRelations(value: Boolean): Self = StObject.set(x, "loadEagerRelations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadEagerRelationsUndefined: Self = StObject.set(x, "loadEagerRelations", js.undefined)
      
      @scala.inline
      def setLoadRelationIds(value: Boolean | DisableMixedMap): Self = StObject.set(x, "loadRelationIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadRelationIdsUndefined: Self = StObject.set(x, "loadRelationIds", js.undefined)
      
      @scala.inline
      def setLock(value: Mode | `2`): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
      
      @scala.inline
      def setOrder(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ P in keyof Entity ]:? 'ASC' | 'DESC' | 1 | -1}
        */ typings.typeorm.typeormStrings.FindOneOptions with TopLevel[js.Any]
      ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setRelations(value: js.Array[String]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
      
      @scala.inline
      def setRelationsVarargs(value: String*): Self = StObject.set(x, "relations", js.Array(value :_*))
      
      @scala.inline
      def setSelect(value: js.Array[/* keyof Entity */ String]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      @scala.inline
      def setSelectVarargs(value: (/* keyof Entity */ String)*): Self = StObject.set(x, "select", js.Array(value :_*))
      
      @scala.inline
      def setTransaction(value: Boolean): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
      
      @scala.inline
      def setWhere(value: js.Array[FindConditions[Entity]] | FindConditions[Entity] | ObjectLiteral | String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
      
      @scala.inline
      def setWhereVarargs(value: FindConditions[Entity]*): Self = StObject.set(x, "where", js.Array(value :_*))
      
      @scala.inline
      def setWithDeleted(value: Boolean): Self = StObject.set(x, "withDeleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithDeletedUndefined: Self = StObject.set(x, "withDeleted", js.undefined)
    }
  }
}
