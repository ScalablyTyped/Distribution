organization := "org.scalablytyped"
name := "web3-shh"
version := "1.2.2-bd2143"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bn_dot_js" % "4.11-dt-20190328Z-c45db0",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "web3-core" % "1.2.2-57a04e",
  "org.scalablytyped" %%% "web3-core-helpers" % "1.2.2-828324",
  "org.scalablytyped" %%% "web3-core-method" % "1.2.2-e8b753",
  "org.scalablytyped" %%% "web3-net" % "1.2.2-a9720b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        