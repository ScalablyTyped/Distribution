package typings.webgme

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Error
import typings.webgme.Blobs.BlobClient
import typings.webgme.Blobs.BlobMetadata
import typings.webgme.Blobs.ObjectBlob
import typings.webgme.Core.Constraint
import typings.webgme.Core.DataObject
import typings.webgme.Core.GUID
import typings.webgme.Core.GmePersisted
import typings.webgme.Core.MixinViolation
import typings.webgme.Core.Node
import typings.webgme.Core.ObjectHash
import typings.webgme.Core.RelationRule
import typings.webgme.Global_.GmeLogger
import typings.webgme.GmeCommon.ArtifactHash
import typings.webgme.GmeCommon.DefObject
import typings.webgme.GmeCommon.Dictionary
import typings.webgme.GmeCommon.ErrorOnlyCallback
import typings.webgme.GmeCommon.ErrorStr
import typings.webgme.GmeCommon.ISO8601
import typings.webgme.GmeCommon.InAttr
import typings.webgme.GmeCommon.LoadObject
import typings.webgme.GmeCommon.Message
import typings.webgme.GmeCommon.MetaInfo
import typings.webgme.GmeCommon.MetaRules
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.Name
import typings.webgme.GmeCommon.OutAttr
import typings.webgme.GmeCommon.OutPath
import typings.webgme.GmeCommon.Path
import typings.webgme.GmeCommon.ProjectStart
import typings.webgme.GmeCommon.RelId
import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeCommon.VoidFn
import typings.webgme.GmeStorage.CommitHash
import typings.webgme.GmeStorage.CommitHashCallback
import typings.webgme.GmeStorage.CommitObject
import typings.webgme.GmeStorage.CommitResult
import typings.webgme.anon.Children
import typings.webgme.anon.FinishTime
import typings.webgme.anon.Members
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmeClasses {
  
  @js.native
  sealed trait TraversalOrder extends StObject
  @JSGlobal("GmeClasses.TraversalOrder")
  @js.native
  object TraversalOrder extends StObject {
    
    @js.native
    sealed trait BFS
      extends StObject
         with TraversalOrder
    
    @js.native
    sealed trait DFS
      extends StObject
         with TraversalOrder
  }
  
  @js.native
  trait Artifact extends StObject {
    
    /** Adds content to the artifact as a file. */
    def addFile(name: Name, content: ObjectBlob): js.Promise[MetadataHash] = js.native
    /** Adds content to the artifact as a file. */
    def addFile(name: Name, content: ObjectBlob, callback: ResultCallback[MetadataHash]): Unit = js.native
    
    /** Adds files as soft-link. */
    def addFileAsSoftLink(name: Name, content: ObjectBlob): js.Promise[MetadataHash] = js.native
    /** Adds files as soft-link. */
    def addFileAsSoftLink(name: Name, content: ObjectBlob, callback: ResultCallback[MetadataHash]): Unit = js.native
    
    /** Adds multiple files. */
    def addFiles(files: StringDictionary[ObjectBlob]): js.Promise[js.Array[MetadataHash] | String] = js.native
    /** Adds multiple files. */
    def addFiles(files: StringDictionary[ObjectBlob], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
    
    /** Adds multiple files as soft-links. */
    def addFilesAsSoftLinks(files: StringDictionary[ObjectBlob]): js.Promise[js.Array[MetadataHash]] = js.native
    /** Adds multiple files as soft-links. */
    def addFilesAsSoftLinks(files: StringDictionary[ObjectBlob], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
    
    /** Adds a metadataHash to the artifact using the given file path. */
    def addMetadataHash(name: Name, metadataHash: MetadataHash): js.Promise[MetadataHash] = js.native
    def addMetadataHash(name: Name, metadataHash: MetadataHash, size: Double): js.Promise[MetadataHash] = js.native
    /** Adds a metadataHash to the artifact using the given file path. */
    def addMetadataHash(name: Name, metadataHash: MetadataHash, size: Double, callback: ResultCallback[MetadataHash]): Unit = js.native
    /** Adds a metadataHash to the artifact using the given file path. */
    def addMetadataHash(objectHashes: StringDictionary[String]): js.Promise[MetadataHash] = js.native
    /** Adds a metadataHash to the artifact using the given file path. */
    def addMetadataHash(objectHashes: StringDictionary[String], callback: ResultCallback[MetadataHash]): Unit = js.native
    
    /** Adds metadataHashes to the artifact using the given file paths. */
    def addMetadataHashes(name: Name, metadataHash: MetadataHash): js.Promise[js.Array[MetadataHash]] = js.native
    def addMetadataHashes(name: Name, metadataHash: MetadataHash, size: Double): js.Promise[js.Array[MetadataHash]] = js.native
    /** Adds metadataHashes to the artifact using the given file paths. */
    def addMetadataHashes(
      name: Name,
      metadataHash: MetadataHash,
      size: Double,
      callback: ResultCallback[js.Array[MetadataHash]]
    ): Unit = js.native
    /** Adds metadataHashes to the artifact using the given file paths. */
    def addMetadataHashes(objectHashes: StringDictionary[String]): js.Promise[js.Array[MetadataHash]] = js.native
    /** Adds metadataHashes to the artifact using the given file paths. */
    def addMetadataHashes(objectHashes: StringDictionary[String], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
    
    /** Adds a metadataHash to the artifact using the given file path. */
    def addObjectHash(name: Name, metadataHash: MetadataHash): js.Promise[MetadataHash] = js.native
    /** Adds a metadataHash to the artifact using the given file path. */
    def addObjectHash(name: Name, metadataHash: MetadataHash, callback: ResultCallback[MetadataHash]): Unit = js.native
    
    /** Adds metadataHashes to the artifact using the given file paths. */
    def addObjectHashes(objectHashes: StringDictionary[String]): js.Promise[js.Array[MetadataHash]] = js.native
    /** Adds metadataHashes to the artifact using the given file paths. */
    def addObjectHashes(objectHashes: StringDictionary[String], callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
    
    var blobClient: BlobClient = js.native
    
    var descriptor: BlobMetadata = js.native
    
    var name: Name = js.native
    
    /** Saves this artifact and uploads the metadata to the server's storage. */
    def save(): js.Promise[MetadataHash] = js.native
    /** Saves this artifact and uploads the metadata to the server's storage. */
    def save(callback: ResultCallback[MetadataHash]): Unit = js.native
    def save(message: String): js.Promise[MetadataHash] = js.native
  }
  
  type ArtifactCallback = js.Function2[/* err */ Error, /* result */ Artifact, Unit]
  
  trait Commit extends StObject {
    
    var branchName: String
    
    var commitHash: MetadataHash
    
    var status: String
  }
  object Commit {
    
    inline def apply(branchName: String, commitHash: MetadataHash, status: String): Commit = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], commitHash = commitHash.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commit]
    }
    
    extension [Self <: Commit](x: Self) {
      
      inline def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
      
      inline def setCommitHash(value: MetadataHash): Self = StObject.set(x, "commitHash", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Core extends StObject {
    
    /**
      * It adds a project as library to your project by copying it over. 
      * The library will be a node with the given name directly 
      * under your project's ROOT. 
      * It becomes a read-only portion of your project. 
      * You will only be able to manipulate it with library functions, 
      * but cannot edit the individual nodes inside. 
      * However you will be able to instantiate or copy 
      * the nodes into other places of your project. 
      * Every node that was part of the META in the 
      * originating project becomes part of your project's meta.
      * 
      * @param node any regular node in your project.
      * @param name the name of the library you wish to use as a namespace in your project.
      * @param libraryRootHash the hash of your library's root (must exist in the project's collection at the time of call).
      * @param libraryInfo information about your project.
      */
    def addLibrary(node: Node, name: Name, libraryRootHash: String, libraryInfo: LibraryInfo): js.Promise[DataObject] = js.native
    /**
      * It adds a project as library to your project by copying it over. 
      * The library will be a node with the given name directly 
      * under your project's ROOT. 
      * It becomes a read-only portion of your project. 
      * You will only be able to manipulate it with library functions, 
      * but cannot edit the individual nodes inside. 
      * However you will be able to instantiate or copy 
      * the nodes into other places of your project. 
      * Every node that was part of the META in the 
      * originating project becomes part of your project's meta.
      * 
      * @param node any regular node in your project.
      * @param name the name of the library you wish to use as a namespace in your project.
      * @param libraryRootHash the hash of your library's root (must exist in the project's collection at the time of call).
      * @param libraryInfo information about your project.
      */
    def addLibrary(
      node: Node,
      name: Name,
      libraryRootHash: String,
      libraryInfo: LibraryInfo,
      callback: ResultCallback[DataObject]
    ): Unit = js.native
    
    /**
      * Adds a member to the given set.
      * @param node the owner of the set.
      * @param name the name of the set.
      * @param member the new member of the set.
      * @return If the set is not allowed to be modified, 
      * the function returns an error.
      */
    def addMember(node: Node, name: Name, member: Node): js.UndefOr[Error] = js.native
    
    /**
      * Adds a mixin to the mixin set of the node.
      * @param node the node in question.
      * @param the path of the mixin node.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def addMixin(node: Node, mixinPath: Path): js.UndefOr[Error] = js.native
    
    /**
      * When our attempt to merge two patches ended in some conflict, 
      * then we can modify that result highlighting that in case of every conflict, 
      * which side we prefer (mine vs. theirs). 
      * If we give that object as an input to this function, 
      * it will finish the merge resolving the conflict according 
      * our settings and present a final patch.
      * @param conflict the object that represents our 
      * settings for every conflict and the so-far-merged patch.
      * @return The function results in a tree structured patch 
      * object that contains the changes that cover both 
      * parties modifications 
      * (and the conflicts are resolved according the input settings).
      */
    def applyResolution(conflict: js.Object): js.Object = js.native
    
    /**
      * Apply changes to the current project.
      * @param root
      * @param patch
      * @return only reports errors.
      */
    def applyTreeDiff(root: Node, patch: DataObject): js.Promise[DataObject] = js.native
    /**
      * Apply changes to the current project.
      * @param root
      * @param patch
      * @return only reports errors.
      */
    def applyTreeDiff(root: Node, patch: DataObject, callback: ResultCallback[DataObject]): Unit = js.native
    
    /**
      * Checks if the given path can be added as a mixin to the given node.
      * @param node the node in question.
      * @param mixinPath the path of the mixin node.
      * @return Returns if the mixin could be added, or the reason why it is not.
      */
    def canSetAsMixin(node: Node, mixinPath: Path): Boolean | String = js.native
    
    /**
      * Removes all META rules that were specifically defined for the node 
      * (so the function do not touches inherited rules).
      * @param node the node in question.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def clearMetaRules(node: Node): js.UndefOr[Error] = js.native
    
    /**
      * Removes all mixins for a given node.
      * @param node the node in question.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def clearMixins(node: Node): js.UndefOr[Error] = js.native
    
    /**
      * Copies the given node into parent.
      * @param node the node to be copied.
      * @param parent the target parent where the copy will be placed.
      * @return The function returns the copied node or an error if the copy is not allowed.
      */
    def copyNode(node: Node, parent: Node): Node | Error = js.native
    
    /**
      * Copies the given nodes into parent.
      * @param nodes the nodes to be copied.
      * @param parent the target parent where the copies will be placed.
      * @return The function returns an array of the copied nodes or an error 
      * if any of the nodes are not allowed to be copied to the given parent.
      */
    def copyNodes(nodes: js.Array[Node], parent: Node): js.Array[Node] | Error = js.native
    
    /**
      * Creates a node according to the given parameters.
      * @param parameters the details of the creation.
      * @return The function returns the created node or null if no node was 
      * created or an error if the creation with the given parameters are not allowed.
      */
    def createNode(parameters: NodeParameters): Node | Error = js.native
    
    /**
      * Creates a set for the node.
      * @param node the node that will own the set.
      * @param name the name of the set.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def createSet(node: Node, name: Name): js.UndefOr[Error] = js.native
    
    /**
      * Removes the given aspect rule of the node.
      * @param node the node whose aspect rule will be deleted.
      * @param name the name of the aspect rule.
      * @return  If the node is not allowed to be modified, the function returns an error.
      */
    def delAspectMeta(node: Node, name: Name): js.UndefOr[Error] = js.native
    
    /**
      * Removes a valid type from the given aspect of the node.
      * @param node the node in question.
      * @param name the name of the aspect rule.
      * @param targetPath the absolute path of the valid type of the aspect.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def delAspectMetaTarget(node: Node, name: Name, targetPath: Path): js.UndefOr[Error] = js.native
    
    /**
      * Removes the given attributes from the given node.
      * @param node the node in question.
      * @param name the name of the attribute.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def delAttribute(node: Node, name: Name): js.UndefOr[Error] = js.native
    
    /**
      * Removes an attribute definition from the META rules of the node.
      * @param name the node in question.
      * @param name the name of the attribute.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def delAttributeMeta(node: Node, name: Name): js.UndefOr[Error] = js.native
    
    /**
      * Removes the given child rule from the node.
      * @param the node in question.
      * @param childPath the absolute path of the child which rule is to be removed from the node.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def delChildMeta(node: Node, childPath: Path): js.UndefOr[Error] = js.native
    
    /**
      * Removes a constraint from the node.
      * @param node the node in question.
      * @param name the name of the constraint.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def delConstraint(node: Node, name: Name): js.UndefOr[Error] = js.native
    
    /**
      * Removes a member from the set. The functions doesn't remove the node itself.
      * @param node the node in question.
      * @param name the name of the set.
      * @param path the path to the member to be removed.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def delMember(node: Node, name: Name, path: Path): js.UndefOr[Error] = js.native
    
    /**
      * Removes an attribute which represented a property of the given set membership.
      * @param node the node in question.
      * @param setName the name of the set.
      * @param memberPath the path to the member to be removed.
      * @param attrName the name of the attribute.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def delMemberAttribute(node: Node, setName: Name, memberPath: Path, attrName: Name): js.UndefOr[Error] = js.native
    
    /**
      * Removes a registry entry which represented a property of the given set membership.
      * @param node the node in question.
      * @param setName the name of the set.
      * @param memberPath the path to the member to be removed.
      * @param regName the name of the registry entry.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def delMemberRegistry(node: Node, setName: Name, memberPath: Path, regName: Name): js.UndefOr[Error] = js.native
    
    /**
      * Removes a mixin from the mixin set of the node.
      * @param node the node in question.
      * @param mixinPath the path of the mixin node.
      * @return If the node is not allowed to be modified, the function returns an error. 
      */
    def delMixin(node: Node, mixinPath: Path): js.UndefOr[Error] = js.native
    
    /**
      * Removes the complete META rule regarding the given pointer/set of the node.
      * @param node the node in question.
      * @param name the name of the pointer/set.
      * @return If the node is not allowed to be modified, the function returns an error. 
      */
    def delPointerMeta(node: Node, name: Name): js.UndefOr[Error] = js.native
    
    /**
      * Removes a possible target type from the pointer/set of the node.
      * @param node the node in question.
      * @param name the name of the pointer/set.
      * @param targetPath the absolute path of the possible target type.
      * @return If the node is not allowed to be modified, the function returns an error. 
      */
    def delPointerMetaTarget(node: Node, name: Name, targetPath: String): js.UndefOr[Error] = js.native
    
    /**
      * Removes the given registry entry from the given node.
      * @param node the node in question.
      * @param name the name of the registry entry.
      * @return If the node is not allowed to be modified, the function returns an error. 
      */
    def delRegistry(node: Node, name: Name): js.UndefOr[Error] = js.native
    
    /**
      * Removes the attribute entry for the set at the node.
      * @param node the node in question.
      * @param setName the name of the set.
      * @param attrName the name of the attribute entry.
      * @return If the node is not allowed to be modified, the function returns an error. 
      */
    def delSetAttribute(node: Node, setName: Name, attrName: Name): js.UndefOr[Error] = js.native
    
    /**
      * Removes the registry entry for the set at the node.
      * @param node the node in question.
      * @param setName the name of the set.
      * @param regName the name of the registry entry.
      * @return If the node is not allowed to be modified, the function returns an error. 
      */
    def delSetRegistry(node: Node, setName: Name, regName: Name): js.UndefOr[Error] = js.native
    
    /**
      * Removes a node from the containment hierarchy.
      * It also removes all contained nodes.
      * @param node the node in question.
      * @return If the operation is not allowed it returns an error.
      */
    def deleteNode(node: Node): js.UndefOr[Error] = js.native
    
    /**
      * Removes the pointer from the node.
      * @param node the node in question.
      * @param name the name of the pointer.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def deletePointer(node: Node, name: Name): js.UndefOr[Error] = js.native
    
    /**
      * Removes a set from the node.
      * @param node the node in question.
      * @param name the name of the set.
      * @return If the node is not allowed to be modified, the function returns an error.
      */
    def deleteSet(node: Node, name: Name): js.UndefOr[Error] = js.native
    
    /**
      * Generates a differential tree among the two states 
      * of the project that contains the necessary changes 
      * that can modify the source to be identical to the target. 
      * 
      * @param sourceRoot the root node of the source state.
      * @param targetRoot the root node of the target state.
      * @return the result is in form of a json object.
      */
    def generateTreeDiff(sourceRoot: Node, targetRoot: Node): js.Promise[DataObject] = js.native
    /**
      * Generates a differential tree among the two states 
      * of the project that contains the necessary changes 
      * that can modify the source to be identical to the target. 
      * 
      * @param sourceRoot the root node of the source state.
      * @param targetRoot the root node of the target state.
      * @return the result is in form of a json object.
      */
    def generateTreeDiff(sourceRoot: Node, targetRoot: Node, callback: ResultCallback[DataObject]): Unit = js.native
    
    /**
      * Returns all META nodes.
      * @param node any node of the containment hierarchy.
      * @return the function returns a dictionary. 
      * The keys of the dictionary are the absolute 
      * paths of the META nodes of the project. 
      * Every value of the dictionary is a module:Core~Node.
      */
    def getAllMetaNodes(node: Node): Dictionary[Node] = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} name
      * @param {Core.Node} target
      * @return {GmeCommon.MetaInfo}
      */
    def getAspectDefinitionInfo(node: Node, name: Name, target: Node): MetaInfo = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} name
      * @return {Core.Node}
      */
    def getAspectDefinitionOwner(node: Node, name: Name): Node = js.native
    
    /**
      * Returns the list of valid children types of the given aspect.
      * @param node the node in question
      * @param name the name of the aspect.
      * @return the function returns a list of absolute paths 
      * of nodes that are valid children of the node and fits 
      * to the META rules defined for the aspect. 
      * Any children, visible under the given aspect of 
      * the node must be an instance of at least one node 
      * represented by the absolute paths.
      */
    def getAspectMeta(node: Node, name: Name): js.Array[Path] = js.native
    
    def getAttribute(node: Null, name: Name): OutAttr = js.native
    /**
      * Retrieves the value of the given attribute of the given node.
      * @param node - the node in question.
      * @param name - the name of the attribute.
      *
      * @return The function returns the value of the attribute of the node.
      * The retrieved attribute should not be modified as is - it should be copied first!
      * The value can be an object or any primitive type.
      * If the return value is undefined; the node does not have such attribute defined.
      * If the node is undefined the returned value is null.
      */
    def getAttribute(node: Node, name: Name): OutAttr = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} name
      * @return {Core.Node}
      */
    def getAttributeDefinitionOwner(node: Node, name: Name): Node = js.native
    
    /**
      * Returns the definition object of an attribute from the META rules of the node.
      * @param node the node in question.
      * @param name the name of the attribute.
      * @return The function returns the definition object, where type is always defined.
      */
    def getAttributeMeta(node: Node, name: Name): DefObject = js.native
    
    /** 
      * Get the defined attribute names for the node.
      * @param node the node in question.
      * @return The function returns an array of the names of the attributes of the node.
      */
    def getAttributeNames(node: Node): js.Array[Name] = js.native
    
    /** 
      * Get the base node 
      * @param node the node in question.
      * @return the base of the given node or null if there is no such node.
      */
    def getBase(node: Node): Node | Null = js.native
    
    /** 
      * Get the base node at the top of the inheritance chain.
      * @param node the node in question.
      * @return the root of the inheritance chain (usually the FCO). 
      */
    def getBaseRoot(node: Node): Node = js.native
    
    /** 
      * Get the most specific meta node;
      * the closest META node of the node in question. 
      * @param node the node in question.
      * @return the first node (including itself) among the 
      * inheritance chain that is a META node. 
      * It returns null if it does not find such node 
      * (ideally the only node with this result is the ROOT).
      */
    def getBaseType(): Node | Null = js.native
    def getBaseType(node: Node): Node | Null = js.native
    
    /** 
      * Get the most specific meta nodes;
      * Searches for the closest META node of the 
      * node in question and the direct mixins of that node. 
      * @param node the node in question.
      * @return the closest Meta node that is a base of the 
      * given node plus it returns all the mixin nodes 
      * associated with the base in a path-node dictionary.
      */
    def getBaseTypes(node: Node): Dictionary[Node] | Null = js.native
    
    /**
      * Retrieves the child of the input node at the given relative id.
      * It is not an asynchronous load and it automatically creates 
      * the child under the given relative id if no child was there 
      * beforehand.
      * @param node the node in question.
      * @param relativeId the relative id of the child in question.
      * @return an empty node if it was created as a result 
      * of the function or return the already existing 
      * and loaded node if it found.
      */
    def getChild(node: Node, relativeId: String): Node = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {Core.Node} target
      * @return {GmeCommon.MetaInfo}
      */
    def getChildDefinitionInfo(node: Node, target: Node): MetaInfo = js.native
    
    /**
      * Collects the data hash values of the children of the node.
      * @param node the node in question.
      * @return a dictionary of module:Core~ObjectHash that stored in 
      * pair with the relative id of the corresponding child of the node.
      */
    def getChildrenHashes(node: Node): Dictionary[MetadataHash] = js.native
    
    /**
      * Return a JSON representation of the META rules 
      * regarding the valid children of the given node.
      * @param node the node in question.
      * @return a detailed JSON structure that represents the 
      * META rules regarding the possible children of the node.
      */
    def getChildrenMeta(node: Node): RelationRule = js.native
    
    /** 
      * Collects the paths of all the children of the given node.
      * @param node the node in question.
      * @return an array of the absolute paths of the children.
      */
    def getChildrenPaths(parent: Node): js.Array[Path] = js.native
    
    /**
      * Collects the relative ids of all the children of the given node.
      * @param parent the container node in question.
      * @return an array of the relative ids.
      */
    def getChildrenRelids(parent: Node): js.Array[RelId] = js.native
    
    /**
      * Retrieves a list of the defined pointer names that has the node as target.
      * @param node the node in question.
      * @return an array of the names of the pointers pointing to the node.
      */
    def getCollectionNames(node: Node): js.Array[String] = js.native
    
    /**
      * Retrieves a list of absolute paths of nodes that has a 
      * given pointer which points to the given node.
      * @param node the node in question.
      * @param name the name of the pointer.
      * @return an array of absolute paths of nodes having
      *  pointers pointing to the node.
      */
    def getCollectionPaths(node: Node, name: Name): js.Array[Path] = js.native
    
    /**
      * Gets a constraint object of the node.
      * @param node the node in question.
      * @param name the name of the constraint.
      * @return the defined constraint or null if it was not defined for the node
      */
    def getConstraint(node: Node, name: Name): Constraint | Null = js.native
    
    /**
      * Retrieves the list of constraint names defined for the node.
      * @param node the node in question.
      * @return the array of names of constraints available for the node.
      */
    def getConstraintNames(node: Node): js.Array[Name] = js.native
    
    /**
      * Return the root of the inheritance chain of your Meta nodes.
      * @param node the node in question.
      * @return the acting FCO of your project.
      */
    def getFCO(node: Node): Node = js.native
    
    /**
      * @param node the node in question.
      * @return the fully qualified name of the node, 
      * which is the list of its namespaces separated 
      * by dot and followed by the name of the node.
      */
    def getFullyQualifiedName(node: Node): Name = js.native
    
    /**
      * @param node the node in question.
      * @return the globally unique identifier for the node.
      */
    def getGuid(): GUID = js.native
    def getGuid(node: Node): GUID = js.native
    
    /**
      * Returns the calculated database id of the data of the node.
      * @param node the node in question.
      * @return the so called Hash value of the data of the given node.
      *  If the string is empty, then it means that the 
      *  node was mutated but not yet saved to the database, 
      *  so it does not have a hash temporarily.
      */
    def getHash(node: Node): MetadataHash = js.native
    
    /**
      * Collects the paths of all the instances of the given node.
      * @param node the node in question.
      * @return an array of the absolute paths of the instances.
      */
    def getInstancePaths(node: Node): js.Array[Path] = js.native
    
    /**
      * Gives a JSON representation of the META rules of the node.
      * @param node the node in question.
      * @return an object that represents all the META rules of the node.
      */
    def getJsonMeta(node: Node): MetaRules = js.native
    
    /**
      * Returns the origin GUID of any library node.
      * @param node the node in question.
      * @param name of the library where we want to deduct the GUID from. 
      * If not given, than the GUID is computed from the 
      * direct library root of the node
      * @return the origin GUID of the node or error if the query cannot be fulfilled.
      */
    def getLibraryGuid(node: Node): GUID | Error = js.native
    def getLibraryGuid(node: Node, name: Name): GUID | Error = js.native
    
    /**
      * Returns the info associated with the library.
      * @param node the node in question.
      * @param name of the library.
      * @return the information object, stored alongside the library 
      * (that basically carries metaData about the library).
      */
    def getLibraryInfo(node: Node, name: Name): LibraryInfo = js.native
    
    /**
      * Returns all the Meta nodes within the given library. 
      * By default it will include nodes defined in any 
      * library within the given library.
      * @param node the node in question.
      * @param name of the library.
      * @param onlyOwn if true only returns with Meta nodes defined in the library itself.
      * @return an array of core nodes that are part of your meta from the given library.
      */
    def getLibraryMetaNodes(node: Node, name: Name): js.Array[Node] = js.native
    def getLibraryMetaNodes(node: Node, name: Name, onlyOwn: Boolean): js.Array[Node] = js.native
    
    /**
      * Gives back the list of libraries in your project.
      * @param node the node in question.
      * @param name of the library.
      * @param onlyOwn if true only returns with Meta nodes defined in the library itself.
      * @return the fully qualified names of all the 
      * libraries in your project (even embedded ones).
      */
    def getLibraryNames(node: Node): js.Array[Name] = js.native
    
    /**
      * @param node the node in question.
      * @param name of the library.
      * @return the library root node or null, if the library is unknown.
      */
    def getLibraryRoot(node: Node, name: Name): Node | Null = js.native
    
    /**
      * @param node the node in question.
      * @param setName of the set.
      * @param memberPath the absolute path of the member node.
      * @return the value of the attribute. 
      * If it is undefined, 
      * then there is no such attributed connected to the given set membership.
      */
    def getMemberAttribute(node: Node, setName: Name, memberPath: Path, attrName: Name): OutAttr = js.native
    
    /**
      * @param node the node in question.
      * @param name of the set.
      * @param memberPath the absolute path of the member node.
      * @return the array of names of attributes that 
      * represents some property of the membership.
      */
    def getMemberAttributeNames(node: Node, name: Name, memberPath: Path): js.Array[String] = js.native
    
    /**
      * @param node the node in question.
      * @param name of the set.
      * @param memberPath the absolute path of the member node.
      * @return the array of names of attributes that represents some property of the membership.
      */
    def getMemberOwnAttributeNames(node: Node, name: Name, memberPath: Path): js.Array[String] = js.native
    
    /**
      * @param node the node in question.
      * @param name of the set.
      * @param memberPath the absolute path of the member node.
      * @param regName the name of the registry entry.
      * @return the value of the registry. 
      * If it is undefined, than there is no such registry connected to the given set membership.
      */
    def getMemberOwnRegistry(node: Node, name: Name, memberPath: String): OutAttr = js.native
    
    /**
      * Return the names of the registry entries defined 
      * for the set membership specifically defined to the member node.
      * @param node the node in question.
      * @param name of the set.
      * @param memberPath the absolute path of the member node.
      * @return the array of names of registry entries that represents some property of the membership.
      */
    def getMemberOwnRegistryNames(node: Node, name: Name): js.Array[String] = js.native
    
    /**
      * Returns the list of absolute paths of the members of the given set of the given node.
      * @param node the node in question.
      * @param name of the set.
      * @return an array of absolute path strings of the member nodes of the set.
      */
    def getMemberPaths(node: Node, name: Name): js.Array[String] = js.native
    
    /**
      * @param node the node in question.
      * @param setName of the set.
      * @param memberPath the absolute path of the member node.
      * @param regName the name of the registry entry.
      * @return the value of the registry. 
      * If it is undefined, then there is no such registry connected to the given set membership.
      */
    def getMemberRegistry(node: Node, setName: String, memberPath: String, regName: String): OutAttr = js.native
    
    /**
      * @param node the node in question.
      * @param name of the set.
      * @param memberPath the absolute path of the member node.
      * @return the array of names of registry entries that represents some property of the membership.
      */
    def getMemberRegistryNames(node: Node, name: Name, memberpath: String): js.Array[Name] = js.native
    
    /**
      * Checks if the mixins allocated with the node can be used. 
      * Every mixin node should be on the Meta. 
      * Every rule (attribute/pointer/set/aspect/containment/constraint) 
      * should be defined only in one mixin.
      * @param node the node in question.
      * @return the array of violations. If the array is empty, there are no violations.
      */
    def getMixinErrors(node: Node): js.Array[MixinViolation] = js.native
    
    /**
      * Gathers the mixin nodes associated with the node.
      * @param node the node in question.
      * @return the dictionary of the mixin nodes keyed by their paths.
      */
    def getMixinNodes(node: Node): Dictionary[Node] = js.native
    
    /**
      * Gathers the paths of the mixin nodes associated with the node.
      * @param node the node in question.
      * @return the paths of the mixins in an array.
      */
    def getMixinPaths(node: Node): js.Array[Path] = js.native
    
    /**
      * Returns the resolved namespace for the node. 
      * If node is not in a library it returns the empty string. 
      * If the node is in a library of a library - 
      * the full name space is the library names joined together by dots.
      * @param node the node in question.
      * @return the name space of the node.
      */
    def getNamespace(node: Node): Name = js.native
    
    /**
      * @param node the node in question.
      * @return the value of the attribute defined specifically for the node. 
      * If undefined then it means that there is no such 
      * attribute defined directly for the node, 
      * meaning that it either inherits some value or 
      * there is no such attribute at all.
      */
    def getOwnAttribute(node: Node, name: Name): OutAttr = js.native
    
    /**
      * Returns the names of the attributes of the node that have 
      * been first defined for the node and not for its bases.
      * @param node the node in question.
      * @return an array of the names of the own attributes of the node.
      */
    def getOwnAttributeNames(node: Node): js.Array[Name] = js.native
    
    /**
      * Collects the paths of all the children of the given node 
      * that has some data as well and not just inherited.
      * @param parent the node in question.
      * @return an array of the absolute paths of the children.
      */
    def getOwnChildrenPaths(parent: Node): js.Array[Path] = js.native
    
    /**
      * Collects the relative ids of all the children 
      * of the given node that has some data and not just inherited. 
      * n.b. Do not mutate the returned array!
      * @param parent the node in question.
      * @return an array of the relative ids.
      */
    def getOwnChildrenRelids(parent: Node): js.Array[RelId] = js.native
    
    /**
      * Retrieves the list of constraint names defined specifically for the node.
      * @param node the node in question.
      * @return the array of names of constraints for the node.
      */
    def getOwnConstraintNames(node: Node): js.Array[Name] = js.native
    
    /**
      * Returns the META rules specifically defined for the given node.
      * @param node the node in question.
      * @return an object that represent the META 
      * rules that were defined specifically for the node.
      */
    def getOwnJsonMeta(node: Node): MetaRules = js.native
    
    /**
      * Returns the list of absolute paths of the members of the 
      * given set of the given node that not simply inherited.
      * @param node the node in question.
      * @return an array of absolute path strings of the member nodes of 
      * the set that has information on the node's inheritance level.
      */
    def getOwnMemberPaths(node: Node, name: Name): js.Array[Path] = js.native
    
    /**
      * Gathers the mixin nodes associated with the node that were defined specifically for the given node.
      * @param node the node in question.
      * @return the dictionary of the own mixin nodes keyed by their paths.
      */
    def getOwnMixinNodes(node: Node): Dictionary[Node] = js.native
    
    /**
      * Gathers the paths of the mixin nodes associated with the node 
      * that were defined specifically for the given node.
      * @param node the node in question.
      * @return the paths of the own mixins in an array.
      */
    def getOwnMixinPaths(node: Node): js.Array[Path] = js.native
    
    /**
      * Returns the list of the names of the 
      * pointers that were defined specifically for the node.
      * @param node the node in question.
      * @return an array of names of pointers defined specifically for the node.
      */
    def getOwnPointerNames(node: Node): js.Array[Name] = js.native
    
    /**
      * Returns the absolute path of the target 
      * of the pointer specifically defined for the node.
      * @param node the node in question.
      * @param name the name of the pointer.
      * @return the absolute path. 
      * If the path is null, then it means that 'no-target' 
      * was defined specifically for this node for the pointer. 
      * If undefined it means that the node either inherits 
      * the target of the pointer or there is no pointer defined at all.
      */
    def getOwnPointerPath(node: Node, name: Name): OutPath = js.native
    
    /**
      * Returns the value of the registry entry defined for the given node.
      * @param node the node in question.
      * @param name the name of the registry entry.
      * @return the value of the registry entry defined 
      * specifically for the node. 
      * If undefined then it means that there is no such 
      * registry entry defined directly for the node, 
      * meaning that it either inherits some value 
      * or there is no such registry entry at all.
      */
    def getOwnRegistry(node: Node, name: Name): OutAttr = js.native
    
    /**
      * Returns the names of the registry enrties of the node 
      * that have been first defined for the node and not for its bases.
      * @param node the node in question.
      * @return the value of the registry entry defined 
      * specifically for the node. 
      * If undefined then it means that there is 
      * no such registry entry defined directly for the node, 
      * meaning that it either inherits some value 
      * or there is no such registry entry at all.
      */
    def getOwnRegistryNames(node: Node): js.Array[Name] = js.native
    
    /**
      * Get the value of the attribute entry 
      * specifically set for the set at the node.
      * @param node the node in question.
      * @return the value of the attribute. 
      * If it is undefined, than there is no such attribute at the set.
      */
    def getOwnSetAttribute(node: Node): js.Array[OutAttr] = js.native
    
    /**
      * Return the names of the attribute 
      * entries specifically set for the set at the node.
      * @param node the node in question.
      * @return the array of names of attribute entries defined in the set at the node.
      */
    def getOwnSetAttributeNames(node: Node): js.Array[Name] = js.native
    
    /**
      * Returns the names of the sets created specifically at the node. 
      * n.b. When adding a member to a set of a node, 
      * the set is automatically created at the node.
      * @param node the node in question.
      * @return an array of set names that were specifically created at the node.
      */
    def getOwnSetNames(node: Node): js.Array[Name] = js.native
    
    /**
      * Get the value of the registry entry specifically set for the set at the node.
      * @param node the node in question.
      * @param setName the name of the set.
      * @param regName the name of the registry entry.
      * @return the value of the registry. 
      * If it is undefined, than there is no such registry at the set.
      */
    def getOwnSetRegistry(node: Node, setName: Name, regName: Name): js.Array[OutAttr] = js.native
    
    /**
      * Return the names of the registry entries specifically set for the set at the node.
      * @param node the node in question.
      * @param setName the name of the set.
      * @return the array of names of registry entries defined in the set at the node.
      */
    def getOwnSetRegistryNames(node: Node, setName: Name): js.Array[Name] = js.native
    
    /**
      * Returns the list of the META defined aspect 
      * names of the node that were specifically defined for the node.
      * @param node the node in question.
      * @return the aspect names that are specifically defined for the node.
      */
    def getOwnValidAspectNames(node: Node): js.Array[Name] = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} name
      * @return {GmeCommon.Path[]}
      */
    def getOwnValidAspectTargetPaths(node: Node, name: Name): js.Array[Path] = js.native
    
    /**
      * Returns the list of the META defined attribute 
      * names of the node that were specifically defined for the node.
      * @param node the node in question.
      * @return the attribute names that are defined specifically for the node.
      */
    def getOwnValidAttributeNames(node: Node): js.Array[Name] = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @return {GmeCommon.Name[]}
      */
    def getOwnValidPointerNames(node: Node): js.Array[Name] = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @return {GmeCommon.Name[]}
      */
    def getOwnValidSetNames(node: Node): js.Array[Name] = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} name
      * @return {GmeCommon.Path[]}
      */
    def getOwnValidTargetPaths(node: Node, name: Name): js.Array[Path] = js.native
    
    /** 
      * The parent paths are available from the node. 
      * @param node the node in question.
      * @return the parent of the node or NULL if it has no parent.
      */
    def getParent(node: Node): Node | Null = js.native
    
    /**  
      * Returns the complete path of the node in the containment hierarchy. 
      * @param node the node in question.
      * @return a path string where each portion is a relative id and they are separated by '/'. 
      * The path can be empty as well if the node in question is the root itself, 
      * otherwise it should be a chain of relative ids from the root of the containment hierarchy.
      */
    def getPath(node: Node): Path = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} name
      * @param {Core.Node} target
      * @return {GmeCommon.MetaInfo}
      */
    def getPointerDefinitionInfo(node: Node, name: Name, target: Node): MetaInfo = js.native
    
    /**
      * Return a JSON representation of the META rules regarding the given pointer/set of the given node.
      * @param node the node in question.
      * @return a detailed JSON structure that represents the META rules regarding the given pointer/set of the node.
      */
    def getPointerMeta(node: Node, name: Name): RelationRule = js.native
    
    /**
      * Retrieves a list of the defined pointer names of the node.
      * @param node the node in question.
      * @return an array of the names of the pointers of the node.
      */
    def getPointerNames(node: Node): js.Array[Name] = js.native
    
    /**
      * Retrieves the path of the target of the given pointer of the given node.
      * @param node the node in question.
      * @return the absolute path of the target node if there is a valid target. 
      * It returns null if though the pointer is defined it does not have any valid target. 
      * Finally, it return undefined if there is no pointer defined for the node under the given name.
      */
    def getPointerPath(node: Node, name: Name): OutPath = js.native
    
    /** 
      * Get the assigned registry.
      * Retrieves the value of the given registry entry of the given node. 
      * @param node the node in question.
      * @return the value of the registry entry of the node. 
      * The value can be an object or any primitive type. 
      * If the value is undefined that means the node do not have such attribute defined. 
      * n.b. The retrieved registry value should not be modified as is - it should be copied first!!]
      */
    def getRegistry(node: Node, name: Name): OutAttr = js.native
    
    /** 
      * Get the defined registry names.
      * Returns the names of the defined registry entries of the node.
      * @param node the node in question.
      * @return an array of the names of the registry entries of the node.
      */
    def getRegistryNames(node: Node): js.Array[String] = js.native
    
    /** 
      * Get the relative id.
      * Returns the parent-relative identifier of the node.
      * @param node the node in question.
      * @return the id string or return NULL and UNDEFINED if there is no such id for the node.
      */
    def getRelid(node: Node): js.UndefOr[RelId | Null] = js.native
    
    /**
      * Returns the root node of the containment tree that node is part of.
      * @param node the node in question.
      * @return the root of the containment hierarchy (it can be the node itself).
      */
    def getRoot(node: Node): Node = js.native
    
    /**
      * Get the value of the attribute entry in the set.
      * @param node the node in question.
      * @param setName the name of the set.
      * @param attrName the name of the attribute entry.
      * @return 
      */
    def getSetAttribute(node: Node, setName: Name, attrName: Name): OutAttr = js.native
    
    /**
      * Return the names of the attribute entries for the set.
      * @param node the node in question.
      * @param setName the name of the set.
      * @return the array of names of attribute entries in the set.
      */
    def getSetAttributeNames(node: Node, setName: Name): js.Array[Name] = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} name
      * @param {Core.Node} target
      * @return {GmeCommon.MetaInfo}
      */
    def getSetDefinitionInfo(node: Node, name: Name, target: Node): MetaInfo = js.native
    
    /**
      * Returns the names of the sets of the node.
      * @param node the node in question.
      * @return an array of set names that the node has.
      */
    def getSetNames(node: Node): js.Array[String] = js.native
    
    /**
      * Get the value of the registry entry in the set.
      * @param node the node in question.
      * @param setName the name of the set.
      * @param regName the name of the registry entry.
      * @return the value of the registry. If it is undefined, than there is no such registry at the set.
      */
    def getSetRegistry(node: Node, setName: Name, regName: Name): OutAttr = js.native
    
    /**
      * Return the names of the registry entries for the set.
      * @param node the node in question.
      * @param setName the name of the set.
      * @return the array of names of registry entries in the set.
      */
    def getSetRegistryNames(node: Node, setName: Name): js.Array[Name] = js.native
    
    /**
      * Returns the root of the inheritance chain (cannot be the node itself).
      * @param node the node in question.
      * @return the root of the inheritance chain of the node. 
      * If returns null, that means the node in question is the root of the chain.
      */
    def getTypeRoot(node: Node): Node | Null = js.native
    
    /**
      * Returns the list of the META defined aspect names of the node.
      * @param node the node in question.
      * @return all the aspect names that are defined among the META rules of the node.
      */
    def getValidAspectNames(node: Node): js.Array[Name] = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} name
      * @return {GmeCommon.Path[]}
      */
    def getValidAspectTargetPaths(node: Node, name: Name): js.Array[Path] = js.native
    
    /**
      * Returns the list of the META defined attribute names of the node.
      * @param node the node in question.
      * @return all the attribute names that are defined among the META rules of the node.
      */
    def getValidAttributeNames(node: Node): js.Array[Name] = js.native
    
    /**
      * Retrieves the valid META nodes that can be base of a child of the node.
      * @param node the node in question.
      * @return a list of valid nodes that can be instantiated as a child of the node.
      */
    def getValidChildrenMetaNodes(parameters: MetaNodeParameters): js.Array[Node] = js.native
    
    /**
      * Returns the list of absolute path of the valid children types of the node.
      * @param node the node in question.
      * @return an array of absolute paths of the nodes 
      * that was defined as valid children for the node.
      */
    def getValidChildrenPaths(node: Node): js.Array[Path] = js.native
    
    /**
      * Returns the list of the META defined pointer names of the node.
      * @param node the node in question.
      * @return all the pointer names that are defined among the META rules of the node.
      */
    def getValidPointerNames(node: Node): js.Array[Name] = js.native
    
    /**
      * Retrieves the valid META nodes that can be base of a member of the set of the node.
      * @param parameters 
      * @return a list of valid nodes that can be instantiated as a member of the set of the node.
      */
    def getValidSetMetaNodes(parameters: MetaSetParameters): js.Array[Node] = js.native
    
    /**
      * Returns the list of the META defined set names of the node.
      * @param node the node in question.
      * @return all the set names that are defined among the META rules of the node.
      */
    def getValidSetNames(node: Node): js.Array[Name] = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} name
      * @return {GmeCommon.Path[]}
      */
    def getValidTargetPaths(node: Node, name: Name): js.Array[Path] = js.native
    
    /**
      * Checks if the node is abstract.
      * @param node the node in question.
      * @return true if the registry entry 'isAbstract' of the node if true hence the node is abstract.
      */
    def isAbstract(node: Node): Boolean = js.native
    
    /** 
      * Check is the node is a connection-like node.
      * Connections are just nodes with two pointers named "src" and "dst". 
      * @param node the node in question.
      * @return true if both the 'src' and 'dst' pointer are defined as valid for the node.
      */
    def isConnection(node: Node): Boolean = js.native
    
    /**
      * Checks if the node in question has some actual data.
      * @param node the node in question.
      * @return true if the node is 'empty' meaning that it is not reserved by real data. 
      *  false if the node is exists and have some meaningful value.
      */
    def isEmpty(node: Node): Boolean = js.native
    
    /**
      * Checks if the member is completely overridden in the set of the node.
      * @param node the node in question.
      * @param setName the name of the set.
      * @param memberPath the absolute path to the set member.
      * @return true if the member exists in the base of the set, 
      * but was added to the given set as well, which means a complete override. 
      * If the set does not exist or the member do not have 
      * a 'base' member or just some property was overridden, the function returns false.
      */
    def isFullyOverriddenMember(node: Node, setName: Name, memberPath: Path): Boolean = js.native
    
    /**
      * Checks if the node is an instance of base.
      * @param node the node in question.
      * @param type a candidate base node.
      * @return true if the base is on the inheritance chain of node.
      * A node is considered to be an instance of itself here.
      */
    def isInstanceOf(node: Node, base: Node): Boolean = js.native
    
    /**
      * Returns true if the node in question is a library element.
      * @param node the node in question.
      * @return true if your node is a library element, false otherwise.
      */
    def isLibraryElement(node: Node): Boolean = js.native
    
    /**
      * Returns true if the node in question is a library root.
      * @param node the node in question.
      * @return true if your node is a library root 
      * (even if it is embedded in other library), false otherwise.
      */
    def isLibraryRoot(node: Node): Boolean = js.native
    
    /**
      * Returns all membership information of the given node.
      * @param node the node in question.
      * @return a dictionary where every the key of every entry is an absolute path of a set owner node. 
      * The value of each entry is an array with the set names in which the node can be found as a member.
      */
    def isMemberOf(node: Node): DataObject = js.native
    
    /**
      * Checks if the node is a META node.
      * @param node the node in question.
      * @return true if the node is a member of the 
      * METAAspectSet of the ROOT node hence can be seen as a META node.
      */
    def isMetaNode(node: Node): Boolean = js.native
    
    /**
      * Checks if the given node in any way inherits from the typeNode. In addition to checking if the node
      * "isInstanceOf" of typeNode, this methods also takes mixins into account.
      * @param node the node in question.
      * @param type a candidate base node.
      * @return true if the type is in the inheritance chain of the node or false otherwise. 
      * Every node is type of itself.
      */
    def isTypeOf(node: Node, `type`: Node): Boolean = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {Core.Node} parent
      * @param {GmeCommon.Name} name
      * @return {boolean}
      */
    def isValidAspectMemberOf(node: Node, parent: Node, name: Name): Boolean = js.native
    
    /**
      * Checks if the given value is of the necessary type, according to the META rules.
      * @param node the node in question.
      * @param name the name of the attribute.
      * @param value the value for the attribute.
      * @return 
      */
    def isValidAttributeValueOf(node: Node, name: Name, value: InAttr): Boolean = js.native
    
    /**
      * Checks if according to the META rules the given node can be a child of the parent.
      * @param node the node in question.
      * @return true if according to the META rules the node can be a child of the parent. 
      * The check does not cover multiplicity 
      * (so if the parent can only have two children and it already has them, 
      * this function will still returns true).
      */
    def isValidChildOf(node: Node, parent: Node): Boolean = js.native
    
    /**
      * Checks if base can be the new base of node.
      * @param node the node in question.
      * @param base the new base node.
      * @return true if the supplied base is a valid base for the node.
      */
    def isValidNewBase(node: Node): Boolean = js.native
    def isValidNewBase(node: Node, base: Node): Boolean = js.native
    
    /**
      * Checks if parent can be the new parent of node.
      * @param node the node in question.
      * @param parent the new parent.
      * @return true if the supplied parent is a valid parent for the node.
      */
    def isValidNewParent(node: Node, parent: Node): Boolean = js.native
    
    /**
      * Returns the list of the META defined pointers of the node.
      * @param node the node in question.
      * @param source the source node to test.
      * @return  true if according to the META rules, 
      * the given node is a valid target of the given pointer of the source.
      */
    def isValidTargetOf(node: Node, source: Node, name: Name): Boolean = js.native
    
    /**
      * From the given starting node, it loads the path 
      * given as a series of relative ids (separated by '/') and returns the node it finds at the ends of the path. 
      * If there is no node, the function will return null.
      * @param startNode the starting node of our search.
      * @param relativePath the relative path - built by relative ids - of the node in question.
      */
    def loadByPath(startNode: Node, relativePath: Path): js.Promise[typings.webgme.GmeCommon.DataObject] = js.native
    /**
      * From the given starting node, it loads the path 
      * given as a series of relative ids (separated by '/') and returns the node it finds at the ends of the path. 
      * If there is no node, the function will return null.
      * @param startNode the starting node of our search.
      * @param relativePath the relative path - built by relative ids - of the node in question.
      */
    def loadByPath(startNode: Node, relativePath: Path, callback: ResultCallback[typings.webgme.GmeCommon.DataObject]): Unit = js.native
    
    /**
      * Loads the child of the given parent pointed by the relative id. 
      * Behind the scenes, it means that it actually loads the 
      * data pointed by a hash stored inside the parent under 
      * the given id and wraps it in a node object which will 
      * be connected to the parent as a child in the containment hierarchy. 
      * If there is no such relative id reserved, the call will return with null.
      * @param parent the container node in question.
      * @param relativeId the relative id of the child in question.
      */
    def loadChild(parent: Node, relativeId: String): js.Promise[js.Array[typings.webgme.GmeCommon.DataObject]] = js.native
    /**
      * Loads the child of the given parent pointed by the relative id. 
      * Behind the scenes, it means that it actually loads the 
      * data pointed by a hash stored inside the parent under 
      * the given id and wraps it in a node object which will 
      * be connected to the parent as a child in the containment hierarchy. 
      * If there is no such relative id reserved, the call will return with null.
      * @param parent the container node in question.
      * @param relativeId the relative id of the child in question.
      */
    def loadChild(
      parent: Node,
      relativeId: String,
      callback: ResultCallback[js.Array[typings.webgme.GmeCommon.DataObject]]
    ): Unit = js.native
    
    /**
      * Loads all the children of the given parent. 
      * As it first checks the already reserved relative ids of the parent, 
      * it only loads the already existing children (so no on-demand empty node creation).
      * @param parent the container node in question.
      * @see https://github.com/webgme/webgme/wiki/GME-Core-API#containment-methods
      */
    def loadChildren(parent: Node): js.Promise[js.Array[typings.webgme.GmeCommon.DataObject]] = js.native
    /**
      * Loads all the children of the given parent. 
      * As it first checks the already reserved relative ids of the parent, 
      * it only loads the already existing children (so no on-demand empty node creation).
      * @param parent the container node in question.
      * @see https://github.com/webgme/webgme/wiki/GME-Core-API#containment-methods
      */
    def loadChildren(parent: Node, callback: ResultCallback[js.Array[typings.webgme.GmeCommon.DataObject]]): Unit = js.native
    
    /**
      * Loads all the source nodes that has such a pointer and its target is the given node.
      * @param target the container node in question.
      * @param pointerName 
      * @return the relative id of the child in question.
      */
    def loadCollection(target: Node, pointerName: Name): js.Promise[js.Array[typings.webgme.GmeCommon.DataObject]] = js.native
    /**
      * Loads all the source nodes that has such a pointer and its target is the given node.
      * @param target the container node in question.
      * @param pointerName 
      * @return the relative id of the child in question.
      */
    def loadCollection(
      target: Node,
      pointerName: Name,
      callback: ResultCallback[js.Array[typings.webgme.GmeCommon.DataObject]]
    ): Unit = js.native
    
    /**
      * Loads all the instances of the given node.
      * @param node the node in question.
      */
    def loadInstances(node: Node): js.Promise[Unit] = js.native
    /**
      * Loads all the instances of the given node.
      * @param node the node in question.
      */
    def loadInstances(node: Node, callback: ErrorOnlyCallback): Unit = js.native
    
    /**
      * Loads all the children of the given parent that has some data and not just inherited. 
      * As it first checks the already reserved relative ids of the parent, 
      * it only loads the already existing children (so no on-demand empty node creation).
      * @param parent the container node in question.
      */
    def loadOwnChildren(parent: Node): js.Promise[Unit] = js.native
    /**
      * Loads all the children of the given parent that has some data and not just inherited. 
      * As it first checks the already reserved relative ids of the parent, 
      * it only loads the already existing children (so no on-demand empty node creation).
      * @param parent the container node in question.
      */
    def loadOwnChildren(parent: Node, callback: ErrorOnlyCallback): Unit = js.native
    
    /**
      * Loads a complete sub-tree of the containment hierarchy starting from the given node, 
      * but load only those children that has some additional data and not purely inherited.
      * @param node the node in question.
      */
    def loadOwnSubTree(node: Node): js.Promise[Unit] = js.native
    /**
      * Loads a complete sub-tree of the containment hierarchy starting from the given node, 
      * but load only those children that has some additional data and not purely inherited.
      * @param node the node in question.
      */
    def loadOwnSubTree(node: Node, callback: ErrorOnlyCallback): Unit = js.native
    
    /**
      * Loads the target of the given pointer of the given node. 
      * In the callback the node can have three values: 
      * if the node is valid, then it is the defined target of a valid pointer, 
      * if the returned value is null, then it means that the pointer is defined, but has no real target, 
      * finally if the returned value is undefined then there is no such pointer defined for the given node.
      * @param source the source node in question.
      * @param pointerName the relative id of the child in question.
      */
    def loadPointer(source: Node, pointerName: String): js.Promise[DataObject] = js.native
    /**
      * Loads the target of the given pointer of the given node. 
      * In the callback the node can have three values: 
      * if the node is valid, then it is the defined target of a valid pointer, 
      * if the returned value is null, then it means that the pointer is defined, but has no real target, 
      * finally if the returned value is undefined then there is no such pointer defined for the given node.
      * @param source the source node in question.
      * @param pointerName the relative id of the child in question.
      */
    def loadPointer(source: Node, pointerName: String, callback: ResultCallback[DataObject]): Unit = js.native
    
    /**
      * Loads the data object with the given hash and makes it a root of a containment hierarchy.
      * @param node the node in question.
      * @return 
      */
    def loadRoot(metadataHash: MetadataHash): js.Promise[DataObject] = js.native
    /**
      * Loads the data object with the given hash and makes it a root of a containment hierarchy.
      * @param node the node in question.
      * @return 
      */
    def loadRoot(metadataHash: MetadataHash, callback: ResultCallback[DataObject]): Unit = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def loadSubTree(node: Node): js.Promise[DataObject] = js.native
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def loadSubTree(node: Node, callback: ResultCallback[DataObject]): Unit = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def loadTree(rootHash: MetadataHash): js.Promise[DataObject] = js.native
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def loadTree(rootHash: MetadataHash, callback: ResultCallback[DataObject]): Unit = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {Core.Node} target
      * @param {GmeCommon.Name} oldName
      * @param {GmeCommon.Name} newName
      * @return {Error}
      */
    def moveAspectMetaTarget(node: Node, target: Node, oldName: Name, newName: Name): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Path} memberPath
      * @param {GmeCommon.Name} oldSetName
      * @param {GmeCommon.Name} newSetName
      * @return {Error}
      */
    def moveMember(node: Node, memberPath: Path, oldSetName: Name, newSetName: Name): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def moveNode(node: Node, parent: Node): Node | Error = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {Core.Node} target
      * @param {GmeCommon.Name} oldName
      * @param {GmeCommon.Name} newName
      * @return {Error}
      */
    def movePointerMetaTarget(node: Node, target: Node, oldName: Name, newName: Name): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def persist(node: Node): GmePersisted = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def removeLibrary(node: Node, name: Name): Unit = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} oldName
      * @param {GmeCommon.Name} newName
      * @return {Error}
      */
    def renameAttribute(node: Node, oldName: Name, newName: Name): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} oldName
      * @param {GmeCommon.Name} newName
      * @return {Error}
      */
    def renameAttributeMeta(node: Node, oldName: Name, newName: Name): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def renameLibrary(node: Node, oldName: String, newName: String): Unit = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} oldName
      * @param {GmeCommon.Name} newName
      * @return {Error}
      */
    def renamePointer(node: Node, oldName: Name, newName: Name): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} oldName
      * @param {GmeCommon.Name} newName
      * @return {Error}
      */
    def renameRegistry(node: Node, oldName: Name, newName: Name): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param {Core.Node} node
      * @param {GmeCommon.Name} oldName
      * @param {GmeCommon.Name} newName
      * @return {Error}
      */
    def renameSet(node: Node, oldName: Name, newName: Name): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setAspectMetaTarget(node: Node, name: Name, target: Node): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setAttribute(node: Node, name: Name, value: InAttr): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setAttributeMeta(node: Node, name: Name, rule: MetaRule): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setBase(node: Node, base: Node): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setChildMeta(node: Node, child: Node): js.UndefOr[Error] = js.native
    def setChildMeta(node: Node, child: Node, min: Double): js.UndefOr[Error] = js.native
    def setChildMeta(node: Node, child: Node, min: Double, max: Double): js.UndefOr[Error] = js.native
    def setChildMeta(node: Node, child: Node, min: Unit, max: Double): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setChildrenMetaLimits(node: Node): js.UndefOr[Error] = js.native
    def setChildrenMetaLimits(node: Node, min: Double): js.UndefOr[Error] = js.native
    def setChildrenMetaLimits(node: Node, min: Double, max: Double): js.UndefOr[Error] = js.native
    def setChildrenMetaLimits(node: Node, min: Unit, max: Double): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setConstraint(node: Node, name: Name, constraint: Constraint): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setGuid(node: Node, guid: GUID): js.Promise[DataObject] = js.native
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setGuid(node: Node, guid: GUID, callback: ResultCallback[DataObject]): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setMemberAttribute(node: Node, setName: String, memberPath: String, SVGPathSegLinetoHorizontalAbsme: String): js.UndefOr[Error] = js.native
    def setMemberAttribute(
      node: Node,
      setName: String,
      memberPath: String,
      SVGPathSegLinetoHorizontalAbsme: String,
      value: InAttr
    ): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setMemberRegistry(node: Node, setName: String, memberPath: String, regName: String): js.UndefOr[Error] = js.native
    def setMemberRegistry(node: Node, setName: String, memberPath: String, regName: String, value: InAttr): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setPointer(node: Node, name: Name): js.UndefOr[Error] = js.native
    def setPointer(node: Node, name: Name, target: Node): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setPointerMetaLimits(node: Node, memberPath: String): js.UndefOr[Error] = js.native
    def setPointerMetaLimits(node: Node, memberPath: String, min: Double): js.UndefOr[Error] = js.native
    def setPointerMetaLimits(node: Node, memberPath: String, min: Double, max: Double): js.UndefOr[Error] = js.native
    def setPointerMetaLimits(node: Node, memberPath: String, min: Unit, max: Double): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def setPointerMetaTarget(node: Node, name: Name, target: Node): js.UndefOr[Error] = js.native
    def setPointerMetaTarget(node: Node, name: Name, target: Node, min: Double): js.UndefOr[Error] = js.native
    def setPointerMetaTarget(node: Node, name: Name, target: Node, min: Double, max: Double): js.UndefOr[Error] = js.native
    def setPointerMetaTarget(node: Node, name: Name, target: Node, min: Unit, max: Double): js.UndefOr[Error] = js.native
    
    /** 
      * TODO
      * Get the assigned registry 
      * @param node the node in question.
      * @return 
      */
    def setRegistry(node: Node, name: Name, value: InAttr): js.UndefOr[Error] = js.native
    
    /**
      * TODO
      * the visitation function will be called for
      * every node in the sub-tree, the second parameter of the function
      * is a callback that should be called to
      * note to the traversal function that the visitation for a given node is finished.
      *  @param node the node in question.
      * @return 
      */
    def traverse(
      node: Node,
      options: TraversalOptions,
      visitFn: js.Function2[/* node */ Node, /* finished */ VoidFn, Unit]
    ): js.Promise[Unit] = js.native
    /**
      * TODO
      * the visitation function will be called for
      * every node in the sub-tree, the second parameter of the function
      * is a callback that should be called to
      * note to the traversal function that the visitation for a given node is finished.
      *  @param node the node in question.
      * @return 
      */
    def traverse(
      node: Node,
      options: TraversalOptions,
      visitFn: js.Function2[/* node */ Node, /* finished */ VoidFn, Unit],
      callback: ResultCallback[DataObject]
    ): Unit = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def tryToConcatChanges(mine: DataObject, theirs: DataObject): DataObject = js.native
    
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def updateLibrary(node: Node, name: Name, libraryRootHash: MetadataHash, libraryInfo: LibraryInfo): js.Promise[DataObject] = js.native
    /**
      * TODO
      * @param node the node in question.
      * @return 
      */
    def updateLibrary(
      node: Node,
      name: Name,
      libraryRootHash: MetadataHash,
      libraryInfo: LibraryInfo,
      callback: ResultCallback[DataObject]
    ): Unit = js.native
  }
  
  trait LibraryInfo extends StObject {
    
    /** the branch that your library follows in the origin project. */
    var branchName: String
    
    /** the version of your library. */
    var commitHash: String
    
    /** the projectId of your library. */
    var projectId: String
  }
  object LibraryInfo {
    
    inline def apply(branchName: String, commitHash: String, projectId: String): LibraryInfo = {
      val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], commitHash = commitHash.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LibraryInfo]
    }
    
    extension [Self <: LibraryInfo](x: Self) {
      
      inline def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
      
      inline def setCommitHash(value: String): Self = StObject.set(x, "commitHash", value.asInstanceOf[js.Any])
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetaNodeParameters extends StObject {
    
    /**
      * if given, 
      * the query filters to contain only types 
      * that are visible in the given aspect.
      */
    var aspect: js.UndefOr[String] = js.undefined
    
    /**
      * if true, 
      * the query tries to filter out even 
      * more nodes according to the multiplicity rules 
      * (the default value is false, 
      * the check is only meaningful if all the children were passed)
      */
    var multiplicity: js.UndefOr[Boolean] = js.undefined
    
    /** the input parameters of the query. */
    var `object`: Children
    
    /** 
      * if true, the query filters out the 
      * abstract and connection-like nodes 
      * (the default value is false) 
      */
    var sensitive: js.UndefOr[Boolean] = js.undefined
  }
  object MetaNodeParameters {
    
    inline def apply(`object`: Children): MetaNodeParameters = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaNodeParameters]
    }
    
    extension [Self <: MetaNodeParameters](x: Self) {
      
      inline def setAspect(value: String): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
      
      inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
      
      inline def setMultiplicity(value: Boolean): Self = StObject.set(x, "multiplicity", value.asInstanceOf[js.Any])
      
      inline def setMultiplicityUndefined: Self = StObject.set(x, "multiplicity", js.undefined)
      
      inline def setObject(value: Children): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
    }
  }
  
  trait MetaRule extends StObject {
    
    var `enum`: js.Array[String]
    
    var `type`: String | Double | Boolean
  }
  object MetaRule {
    
    inline def apply(`enum`: js.Array[String], `type`: String | Double | Boolean): MetaRule = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaRule]
    }
    
    extension [Self <: MetaRule](x: Self) {
      
      inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      inline def setType(value: String | Double | Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetaSetParameters extends StObject {
    
    /**
      * if true, 
      * the query tries to filter out even 
      * more nodes according to the multiplicity rules 
      * (the default value is false, 
      * the check is only meaningful if all the children were passed)
      */
    var multiplicity: js.UndefOr[Boolean] = js.undefined
    
    /** the input parameters of the query. */
    var `object`: Members
    
    /** 
      * if true, the query filters out the 
      * abstract and connection-like nodes 
      * (the default value is false) 
      */
    var sensitive: js.UndefOr[Boolean] = js.undefined
  }
  object MetaSetParameters {
    
    inline def apply(`object`: Members): MetaSetParameters = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaSetParameters]
    }
    
    extension [Self <: MetaSetParameters](x: Self) {
      
      inline def setMultiplicity(value: Boolean): Self = StObject.set(x, "multiplicity", value.asInstanceOf[js.Any])
      
      inline def setMultiplicityUndefined: Self = StObject.set(x, "multiplicity", js.undefined)
      
      inline def setObject(value: Members): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      inline def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
    }
  }
  
  trait NodeParameters extends StObject {
    
    /** the base of the node to be created. */
    var base: js.UndefOr[Node | Null] = js.undefined
    
    /** the GUID of the node to be created */
    var guid: js.UndefOr[GUID] = js.undefined
    
    /** the parent of the node to be created. */
    var parent: js.UndefOr[Node | Null] = js.undefined
    
    /** the relative id of the node to be created 
      * (if reserved, the function returns the node behind the relative id) */
    var relid: js.UndefOr[RelId] = js.undefined
  }
  object NodeParameters {
    
    inline def apply(): NodeParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeParameters]
    }
    
    extension [Self <: NodeParameters](x: Self) {
      
      inline def setBase(value: Node): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseNull: Self = StObject.set(x, "base", null)
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setGuid(value: GUID): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
      
      inline def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setRelid(value: RelId): Self = StObject.set(x, "relid", value.asInstanceOf[js.Any])
      
      inline def setRelidUndefined: Self = StObject.set(x, "relid", js.undefined)
    }
  }
  
  @js.native
  trait Project extends StObject {
    
    /**
      * Creates a new branch with head pointing to the provided commit hash.
      */
    def createBranch(branchName: String, newHash: CommitHash): js.Promise[CommitResult] = js.native
    /**
      * Creates a new branch with head pointing to the provided commit hash.
      */
    def createBranch(branchName: String, newHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
    
    /**
      * Creates a new tag pointing to the provided commit hash.
      */
    def createTag(tagName: String, commitHash: CommitHash): js.Promise[typings.webgme.GmeStorage.ErrorOnlyCallback] = js.native
    /**
      * Creates a new tag pointing to the provided commit hash.
      */
    def createTag(tagName: String, commitHash: CommitHash, callback: typings.webgme.GmeStorage.ErrorOnlyCallback): Unit = js.native
    
    /**
      * Deletes the given branch.
      */
    def deleteBranch(branchName: String, oldHash: CommitHash): js.Promise[CommitResult] = js.native
    /**
      * Deletes the given branch.
      */
    def deleteBranch(branchName: String, oldHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
    
    /**
      * Deletes the given tag.
      */
    def deleteTag(tagName: String, callback: typings.webgme.GmeStorage.ErrorOnlyCallback): Unit = js.native
    /**
      * Deletes the given tag.
      */
    def deleteTag(tagname: String): js.Promise[Unit] = js.native
    
    /**
      * Retrieves the commit hash for the head of the branch.
      */
    def getBranchHash(branchName: String): js.Promise[CommitHash] = js.native
    /**
      * Retrieves the commit hash for the head of the branch.
      */
    def getBranchHash(branchName: String, callback: CommitHashCallback): Unit = js.native
    
    /**
      * Retrieves all branches and their current heads within the project.
      */
    def getBranches(): js.Promise[Dictionary[CommitHash]] = js.native
    /**
      * Retrieves all branches and their current heads within the project.
      */
    def getBranches(callback: ResultCallback[Dictionary[CommitHash]]): Unit = js.native
    
    /**
      * Retrieves the Class ancestor of two commits. 
      * If no ancestor exists it will result in an error.
      */
    def getClassAncestorCommit(commitA: CommitHash, commitB: CommitHash): js.Promise[CommitHash] = js.native
    /**
      * Retrieves the Class ancestor of two commits. 
      * If no ancestor exists it will result in an error.
      */
    def getClassAncestorCommit(commitA: CommitHash, commitB: CommitHash, callback: CommitHashCallback): Unit = js.native
    
    /**
      * Retrieves and array of the latest 
      * (sorted by timestamp) commits for the project. 
      * If timestamp is given it will get number 
      * of commits strictly before before. 
      * If commit hash is specified that 
      * commit will be included too. 
      * n.b. due to slight time differences on different machines, 
      * ancestors may be returned before their descendants. 
      * Unless looking for 'headless' commits 
      * 'getHistory' is the preferred method.
      */
    def getCommits(before: Double, number: Double): js.Promise[CommitObject] = js.native
    /**
      * Retrieves and array of the latest 
      * (sorted by timestamp) commits for the project. 
      * If timestamp is given it will get number 
      * of commits strictly before before. 
      * If commit hash is specified that 
      * commit will be included too. 
      * n.b. due to slight time differences on different machines, 
      * ancestors may be returned before their descendants. 
      * Unless looking for 'headless' commits 
      * 'getHistory' is the preferred method.
      */
    def getCommits(before: Double, number: Double, callback: ResultCallback[CommitObject]): Unit = js.native
    def getCommits(before: CommitHash, number: Double): js.Promise[CommitObject] = js.native
    def getCommits(before: CommitHash, number: Double, callback: ResultCallback[CommitObject]): Unit = js.native
    
    /**
      * Retrieves an array of commits starting from a branch(es) and/or commitHash(es). 
      * The result is ordered by the rules (applied in order) 
      *  1. Descendants are always returned before their ancestors.
      *  2. By their timestamp.
      */
    def getHistory(start: ProjectStart, number: Double): js.Promise[js.Array[CommitObject]] = js.native
    /**
      * Retrieves an array of commits starting from a branch(es) and/or commitHash(es). 
      * The result is ordered by the rules (applied in order) 
      *  1. Descendants are always returned before their ancestors.
      *  2. By their timestamp.
      */
    def getHistory(start: ProjectStart, number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
    
    /**
      * Retrieves all tags and their commits hashes within the project.
      */
    def getTags(): js.Promise[CommitHash] = js.native
    /**
      * Retrieves all tags and their commits hashes within the project.
      */
    def getTags(callback: CommitHashCallback): Unit = js.native
    
    def loadObject(key: String): js.Promise[CommitObject] = js.native
    def loadObject(key: String, callback: ResultCallback[CommitObject]): Unit = js.native
    
    /** 
      * Collects the objects from the server and pre-loads 
      * them into the cache making the load of multiple objects faster.
      * 
      * @param rootKey Hash of the object at the entry point of the paths.
      * @param paths List of paths that needs to be pre-loaded.
      */
    def loadPaths(rootKey: String, paths: js.Array[String]): js.Promise[typings.webgme.GmeStorage.ErrorOnlyCallback] = js.native
    /** 
      * Collects the objects from the server and pre-loads 
      * them into the cache making the load of multiple objects faster.
      * 
      * @param rootKey Hash of the object at the entry point of the paths.
      * @param paths List of paths that needs to be pre-loaded.
      */
    def loadPaths(rootKey: String, paths: js.Array[String], callback: typings.webgme.GmeStorage.ErrorOnlyCallback): Unit = js.native
    
    /**
      * Makes a commit to data base. 
      * Based on the root hash and commit message a 
      * new module:Storage.CommitObject (with returned hash) 
      * is generated and insert together with the 
      * core objects to the database on the server.
      */
    def makeCommit(
      branchName: String,
      parents: js.Array[CommitHash],
      rootHash: ObjectHash,
      coreObjects: DataObject,
      msg: String
    ): js.Promise[CommitResult] = js.native
    /**
      * Makes a commit to data base. 
      * Based on the root hash and commit message a 
      * new module:Storage.CommitObject (with returned hash) 
      * is generated and insert together with the 
      * core objects to the database on the server.
      */
    def makeCommit(
      branchName: String,
      parents: js.Array[CommitHash],
      rootHash: ObjectHash,
      coreObjects: DataObject,
      msg: String,
      callback: ResultCallback[CommitResult]
    ): Unit = js.native
    
    /**
      * Unique ID of project, built up by the ownerId and projectName.
      */
    var projectId: String = js.native
    
    /**
      * Updates the head of the branch.
      */
    def setBranchHash(branchName: String, newHash: CommitHash, oldHash: CommitHash): js.Promise[CommitResult] = js.native
    /**
      * Updates the head of the branch.
      */
    def setBranchHash(
      branchName: String,
      newHash: CommitHash,
      oldHash: CommitHash,
      callback: ResultCallback[CommitResult]
    ): Unit = js.native
  }
  
  @js.native
  trait ProjectInterface extends StObject {
    
    var CONSTANTS: Dictionary[String] = js.native
    
    var ID_NAME: String = js.native
    
    /**
      * Creates a new branch with head pointing to the provided commit hash.
      * @param {string} branchName - Name of branch to create.
      * @param {module:Storage~CommitHash} newHash - New commit hash for branch head.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * {@link module:Storage~CommitResult} <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def createBranch(branchName: Name, newHash: CommitHash): js.Promise[CommitResult] = js.native
    /**
      * Creates a new branch with head pointing to the provided commit hash.
      * @param {string} branchName - Name of branch to create.
      * @param {module:Storage~CommitHash} newHash - New commit hash for branch head.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * {@link module:Storage~CommitResult} <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def createBranch(branchName: Name, newHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
    
    /**
      * Creates a new tag pointing to the provided commit hash.
      * @param {string} tagName - Name of tag to create.
      * @param {module:Storage~CommitHash} commitHash - Commit hash tag will point to.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def createTag(tagName: Name, commitHash: CommitHash): js.Promise[Unit] = js.native
    /**
      * Creates a new tag pointing to the provided commit hash.
      * @param {string} tagName - Name of tag to create.
      * @param {module:Storage~CommitHash} commitHash - Commit hash tag will point to.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def createTag(tagName: Name, commitHash: CommitHash, callback: ResultCallback[Unit]): Unit = js.native
    
    /**
      * Deletes the branch.
      * @param {string} branchName - Name of branch to create.
      * @param {module:Storage~CommitHash} oldHash - Previous commit hash for branch head.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * {@link module:Storage~CommitResult} <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def deleteBranch(branchName: Name, oldHash: CommitHash): js.Promise[CommitResult] = js.native
    /**
      * Deletes the branch.
      * @param {string} branchName - Name of branch to create.
      * @param {module:Storage~CommitHash} oldHash - Previous commit hash for branch head.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * {@link module:Storage~CommitResult} <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def deleteBranch(branchName: Name, oldHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
    
    /**
      * Deletes the given tag.
      * @param {string} tagName - Name of tag to delete.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def deleteTag(tagName: Name): js.Promise[Unit] = js.native
    /**
      * Deletes the given tag.
      * @param {string} tagName - Name of tag to delete.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def deleteTag(tagName: Name, callback: ResultCallback[Unit]): Unit = js.native
    
    /**
      * Retrieves the commit hash for the head of the branch.
      * @param {string} branchName - Name of branch.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * {module:Storage~CommitHash} <b>branchHash</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def getBranchHash(branchName: Name): js.Promise[CommitHash] = js.native
    /**
      * Retrieves the commit hash for the head of the branch.
      * @param {string} branchName - Name of branch.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * {module:Storage~CommitHash} <b>branchHash</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def getBranchHash(branchName: Name, callback: ResultCallback[CommitHash]): Unit = js.native
    
    /**
      * Retrieves all branches and their current heads within the project.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def getBranches(): js.Promise[CommitHash] = js.native
    /**
      * Retrieves all branches and their current heads within the project.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def getBranches(callback: ResultCallback[CommitHash]): Unit = js.native
    
    /**
      * Retrieves and array of the latest (sorted by timestamp) commits for the project.
      * If timestamp is given it will get <b>number</b> of commits strictly <b>before</b>.
      * If commit hash is specified that commit will be included too.
      * <br> N.B. due to slight time differences on different machines, 
      * ancestors may be returned before
      * their descendants. 
      * Unless looking for 'headless' commits 'getHistory' is the preferred method.
      * @param {number|module:Storage~CommitHash} before - Timestamp or commitHash to load history from.
      * @param {number} number - Number of commits to load.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * Array.<{@link module:Storage~CommitObject}> <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def getCommits(before: Double, number: Double): js.Promise[js.Array[CommitObject]] = js.native
    /**
      * Retrieves and array of the latest (sorted by timestamp) commits for the project.
      * If timestamp is given it will get <b>number</b> of commits strictly <b>before</b>.
      * If commit hash is specified that commit will be included too.
      * <br> N.B. due to slight time differences on different machines, 
      * ancestors may be returned before
      * their descendants. 
      * Unless looking for 'headless' commits 'getHistory' is the preferred method.
      * @param {number|module:Storage~CommitHash} before - Timestamp or commitHash to load history from.
      * @param {number} number - Number of commits to load.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * Array.<{@link module:Storage~CommitObject}> <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def getCommits(before: Double, number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
    def getCommits(before: CommitHash, number: Double): js.Promise[js.Array[CommitObject]] = js.native
    def getCommits(before: CommitHash, number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
    
    /**
      * Retrieves the common ancestor of two commits. If no ancestor exists it will result in an error.
      *
      * @param {module:Storage~CommitHash} commitA - Commit hash.
      * @param {module:Storage~CommitHash} commitB - Commit hash.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * {@link module:Storage~CommitHash} <b>commonCommitHash</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def getCommonAncestorCommit(commitA: CommitHash, commitB: CommitHash): js.Promise[CommitHash] = js.native
    /**
      * Retrieves the common ancestor of two commits. If no ancestor exists it will result in an error.
      *
      * @param {module:Storage~CommitHash} commitA - Commit hash.
      * @param {module:Storage~CommitHash} commitB - Commit hash.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * {@link module:Storage~CommitHash} <b>commonCommitHash</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def getCommonAncestorCommit(commitA: CommitHash, commitB: CommitHash, callback: ResultCallback[CommitHash]): Unit = js.native
    
    /**
      * Retrieves an array of commits starting from a branch(es) and/or commitHash(es).
      * <br> The result is ordered by the rules (applied in order)
      * <br> 1. Descendants are always returned before their ancestors.
      * <br> 2. By their timestamp.
      * @param {string|module:Storage~CommitHash|Array} start - Branch name, commit hash or array of these.
      * @param {number} number - Number of commits to load.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * Array.<{@link module:Storage~CommitObject}> <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def getHistory(start: CommitHash | String, number: Double): js.Promise[js.Array[CommitObject]] = js.native
    /**
      * Retrieves an array of commits starting from a branch(es) and/or commitHash(es).
      * <br> The result is ordered by the rules (applied in order)
      * <br> 1. Descendants are always returned before their ancestors.
      * <br> 2. By their timestamp.
      * @param {string|module:Storage~CommitHash|Array} start - Branch name, commit hash or array of these.
      * @param {number} number - Number of commits to load.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * Array.<{@link module:Storage~CommitObject}> <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def getHistory(start: CommitHash | String, number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
    def getHistory(start: js.Array[String], number: Double): js.Promise[js.Array[CommitObject]] = js.native
    def getHistory(start: js.Array[String], number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
    
    /**
      * Retrieves all tags and their commits hashes within the project.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def getTags(): js.Promise[Unit] = js.native
    /**
      * Retrieves all tags and their commits hashes within the project.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def getTags(callback: ResultCallback[Unit]): Unit = js.native
    
    // projectCache: ProjectCache;
    // Functions forwarded to project cache.
    /**
      * Inserts the given object to project-cache.
      *
      * @param {module:Storage~CommitObject|module:Core~ObjectData} obj - Object to be inserted in database.
      * @param {Object.<module:Core~ObjectHash, module:Core~ObjectData>} [stackedObjects] - When used by the core, inserts between persists are stored here.
      * @func
      * @private
      */
    def insertObject(obj: CommitObject, stackedObjects: Dictionary[DataObject]): Unit = js.native
    
    def insertPatchObject(obj: DataObject): Unit = js.native
    /**
      * Try to create the full object from the patch 
      * object by looking for the base object in the cache.
      * If the base has been found it applies the patch and inserts the result. 
      * If any step fails it simply ignores the insert.
      *
      * @param {module:Storage~CommitObject|module:Core~ObjectData} obj - Object to be inserted in database.
      * @func
      * @private
      */
    def insertPatchObject(obj: CommitObject): Unit = js.native
    
    /**
      * Loads the object with hash key from the database or
      * directly from the cache if recently loaded.
      *
      * @param {string} key - Hash of object to load.
      * @param {ProjectInterface~loadObjectCallback} callback - Invoked when object is loaded.
      * @func
      */
    def loadObject(key: String, callback: ResultCallback[LoadObject]): Unit = js.native
    
    /**
      * Collects the objects from the server and pre-loads them into the cache
      * making the load of multiple objects faster.
      *
      * @param {string} rootKey - Hash of the object at the entry point of the paths.
      * @param {string[]} paths - List of paths that needs to be pre-loaded.
      * @param {function} callback - Invoked when objects have been collected.
      * @func
      */
    def loadPaths(rootKey: MetadataHash, paths: js.Array[Path], callback: ResultCallback[js.Any]): Unit = js.native
    
    var logger: GmeLogger = js.native
    
    /**
      * Makes a commit to data base. Based on the root hash and commit message a new
      * {@link module:Storage.CommitObject} (with returned hash)
      * is generated and insert together with the core objects to the database on the server.
      *
      * @example
      * var persisted = core.persist(rootNode);
      *
      * project.makeCommit('master', ['#thePreviousCommitHash'], persisted.rootHash, persisted.objects, 'new commit')
      *   .then(function (result) {
      *     // result = {
      *     //   status: 'SYNCED',
      *     //   hash: '#thisCommitHash'
      *     // }
      *   })
      *   .catch(function (error) {
      *     // error.message = 'Not authorized to read project: guest+project'
      *   });
      * @example
      * project.makeCommit('master', ['#notPreviousCommitHash'], persisted.rootHash, persisted.objects, 'new commit')
      *   .then(function (result) {
      *     // result = {
      *     //   status: 'FORKED',
      *     //   hash: '#thisCommitHash'
      *     // }
      *   })...
      * @example
      * project.makeCommit(null, ['#anExistingCommitHash'], persisted.rootHash, persisted.objects, 'new commit')
      *   .then(function (result) {
      *     // result = {
      *     //   hash: '#thisCommitHash'
      *     // }
      *   })...
      * @example
      * project.makeCommit('master', ['#aPreviousCommitHash'], previousRootHash, {}, 'just adding a commit to master')
      *   .then(function (result) {
      *     // result = {
      *     //   status: 'SYNCED',
      *     //   hash: '#thisCommitHash'
      *     // }
      *   })...
      * @param {string} branchName - Name of branch to update (none if null).
      * @param {module:Storage~CommitHash[]} parents - Parent commit hashes.
      * @param {module:Core~ObjectHash} rootHash - Hash of root object.
      * @param {module:Core~DataObject} coreObjects - Core objects associated with the commit.
      * @param {string} msg='n/a' - Commit message.
      * @param {function} [callback] - If provided no promise will be returned.
      * @async
      * @return {external:Promise}  On success the promise will be resolved with
      * {@link module:Storage~CommitResult} <b>result</b>.<br>
      * On error the promise will be rejected with {Error} <b>error</b>.
      */
    def makeCommit(branchName: Name, parents: CommitHash, rootHash: ObjectHash, coreObjects: DataObject, msg: String): js.Promise[CommitResult] = js.native
    /**
      * Makes a commit to data base. Based on the root hash and commit message a new
      * {@link module:Storage.CommitObject} (with returned hash)
      * is generated and insert together with the core objects to the database on the server.
      *
      * @example
      * var persisted = core.persist(rootNode);
      *
      * project.makeCommit('master', ['#thePreviousCommitHash'], persisted.rootHash, persisted.objects, 'new commit')
      *   .then(function (result) {
      *     // result = {
      *     //   status: 'SYNCED',
      *     //   hash: '#thisCommitHash'
      *     // }
      *   })
      *   .catch(function (error) {
      *     // error.message = 'Not authorized to read project: guest+project'
      *   });
      * @example
      * project.makeCommit('master', ['#notPreviousCommitHash'], persisted.rootHash, persisted.objects, 'new commit')
      *   .then(function (result) {
      *     // result = {
      *     //   status: 'FORKED',
      *     //   hash: '#thisCommitHash'
      *     // }
      *   })...
      * @example
      * project.makeCommit(null, ['#anExistingCommitHash'], persisted.rootHash, persisted.objects, 'new commit')
      *   .then(function (result) {
      *     // result = {
      *     //   hash: '#thisCommitHash'
      *     // }
      *   })...
      * @example
      * project.makeCommit('master', ['#aPreviousCommitHash'], previousRootHash, {}, 'just adding a commit to master')
      *   .then(function (result) {
      *     // result = {
      *     //   status: 'SYNCED',
      *     //   hash: '#thisCommitHash'
      *     // }
      *   })...
      * @param {string} branchName - Name of branch to update (none if null).
      * @param {module:Storage~CommitHash[]} parents - Parent commit hashes.
      * @param {module:Core~ObjectHash} rootHash - Hash of root object.
      * @param {module:Core~DataObject} coreObjects - Core objects associated with the commit.
      * @param {string} msg='n/a' - Commit message.
      * @param {function} [callback] - If provided no promise will be returned.
      * @async
      * @return {external:Promise}  On success the promise will be resolved with
      * {@link module:Storage~CommitResult} <b>result</b>.<br>
      * On error the promise will be rejected with {Error} <b>error</b>.
      */
    def makeCommit(
      branchName: Name,
      parents: CommitHash,
      rootHash: ObjectHash,
      coreObjects: DataObject,
      msg: String,
      callback: ResultCallback[CommitResult]
    ): Unit = js.native
    
    /**
      * Unique ID of project, built up by the ownerId and projectName.
      * @example
      * 'guest+TestProject', 'organization+TestProject2'
      */
    var projectId: String = js.native
    
    var projectName: Name = js.native
    
    /**
      * Updates the head of the branch.
      * @param {string} branchName - Name of branch to update.
      * @param {module:Storage~CommitHash} newHash - New commit hash for branch head.
      * @param {module:Storage~CommitHash} oldHash - Current state of the branch head inside the database.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * {@link module:Storage~CommitResult} <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def setBranchHash(branchName: Name, newHash: CommitHash, oldHash: CommitHash): js.Promise[CommitResult] = js.native
    /**
      * Updates the head of the branch.
      * @param {string} branchName - Name of branch to update.
      * @param {module:Storage~CommitHash} newHash - New commit hash for branch head.
      * @param {module:Storage~CommitHash} oldHash - Current state of the branch head inside the database.
      * @param {function} [callback] - if provided no promise will be returned.
      *
      * @return {external:Promise}  On success the promise will be resolved with
      * {@link module:Storage~CommitResult} <b>result</b>.<br>
      * On error the promise will be rejected with {@link Error} <b>error</b>.
      */
    def setBranchHash(branchName: Name, newHash: CommitHash, oldHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
  }
  
  @js.native
  trait Result extends StObject {
    
    /**
      * Adds a saved artifact to the result - linked via its metadataHash.
      * Takes the metadataHash of saved artifact.
      */
    def addArtifact(metadataHash: MetadataHash): Unit = js.native
    
    /**
      * Adds a commit to the commit container.
      */
    def addCommit(commitData: Commit): Unit = js.native
    
    /**
      * Adds a new plugin message to the messages list.
      */
    def addMessage(pluginMessage: Message): Unit = js.native
    
    /** array of hashes */
    var artifacts: js.Array[ArtifactHash] = js.native
    
    var commits: js.Array[js.Any] = js.native
    
    var error: Error = js.native
    
    var finishTime: Date = js.native
    
    /**
      * Returns the plugin artifacts.
      */
    def getArtifacts(): js.Array[Artifact] = js.native
    
    /**
      * Gets error if any error occured during execution.
      * FIXME: should this return an Error object?
      */
    def getError(): ErrorStr = js.native
    
    /**
      * Gets the ISO 8601 representation of the time when the plugin finished its execution.
      */
    def getFinishTime(): ISO8601 = js.native
    
    /**
      * Returns with the plugin messages.
      */
    def getMessages(): js.Array[Message] = js.native
    
    /**
      * Gets the name of the plugin to which the result object belongs.
      */
    def getPluginName(): String = js.native
    
    /**
      * Gets the ISO 8601 representation of the time when the plugin started its execution.
      */
    def getStartTime(): ISO8601 = js.native
    
    /**
      * Gets the success flag of this result object
      */
    def getSuccess(): Boolean = js.native
    
    /** array of PluginMessages */
    var messages: js.Array[String] = js.native
    
    var pluginName: String = js.native
    
    var projectId: js.Any = js.native
    
    /**
      * Serializes this object to a JSON representation.
      */
    def serialize(): FinishTime = js.native
    
    def setError(error: Error): Unit = js.native
    /**
      * Sets the error string if any error occured during execution.
      */
    def setError(error: ErrorStr): Unit = js.native
    
    /**
      * Sets the ISO 8601 representation of the time when the plugin finished its execution.
      */
    def setFinishTime(time: ISO8601): Unit = js.native
    
    //------------------------------------------
    // Methods used by the plugin manager
    //-----------------------------------------
    /**
      * Sets the name of the plugin to which the result object belongs to.
      */
    def setPluginName(pluginName: String): String = js.native
    
    /**
      * Sets the name of the projectId the result was generated from.
      */
    def setProjectId(projectId: String): Unit = js.native
    
    /**
      * Sets the ISO 8601 representation of the time when the plugin started its execution.
      */
    def setStartTime(time: ISO8601): Unit = js.native
    
    /**
      * Sets the success flag of this result.
      */
    def setSuccess(value: Boolean): Unit = js.native
    
    var startTime: Date = js.native
    
    var success: Boolean = js.native
  }
  
  trait TraversalOptions extends StObject {
    
    var excludeRoot: js.UndefOr[Boolean] = js.undefined
    
    var maxParallelLoad: js.UndefOr[Double] = js.undefined
    
    var order: js.UndefOr[TraversalOrder] = js.undefined
    
    var stopOnError: js.UndefOr[Boolean] = js.undefined
  }
  object TraversalOptions {
    
    inline def apply(): TraversalOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraversalOptions]
    }
    
    extension [Self <: TraversalOptions](x: Self) {
      
      inline def setExcludeRoot(value: Boolean): Self = StObject.set(x, "excludeRoot", value.asInstanceOf[js.Any])
      
      inline def setExcludeRootUndefined: Self = StObject.set(x, "excludeRoot", js.undefined)
      
      inline def setMaxParallelLoad(value: Double): Self = StObject.set(x, "maxParallelLoad", value.asInstanceOf[js.Any])
      
      inline def setMaxParallelLoadUndefined: Self = StObject.set(x, "maxParallelLoad", js.undefined)
      
      inline def setOrder(value: TraversalOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setStopOnError(value: Boolean): Self = StObject.set(x, "stopOnError", value.asInstanceOf[js.Any])
      
      inline def setStopOnErrorUndefined: Self = StObject.set(x, "stopOnError", js.undefined)
    }
  }
}
