
# Scala.js typings for swagger-jsdoc

Typings are for version 3.0

## Library description:
Generates swagger doc based on JSDoc

|                    |                 |
| ------------------ | :-------------: |
| Full name          | swagger-jsdoc |
| Keywords           | jsdoc, restful, api, express, swagger |
| # releases         | 24 |
| # dependents       | 58 |
| # downloads        | 1961207 |
| # stars            | 20 |

## Links
- [Homepage](https://github.com/Surnet/swagger-jsdoc)
- [Bugs](https://github.com/Surnet/swagger-jsdoc/issues)
- [Repository](https://github.com/Surnet/swagger-jsdoc)
- [Npm](https://www.npmjs.com/package/swagger-jsdoc)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for swagger-jsdoc 3.0
// Project: https://github.com/surnet/swagger-jsdoc
// Definitions by: Daniel Grove <https://github.com/drGrove>
//                 Neil Bryson Cargamento <https://github.com/neilbryson>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.2
/* =================== USAGE ===================

    import * as express from 'express';
    import * as swaggerJSDoc  from 'swagger-jsdoc';

    const app = express();

    const options: swaggerJSDoc.Options = {
        swaggerDefinition: {
          info: {
            title: 'Hello World',
            version: '1.0.0',
            description: 'A sample API'
          },
          host: 'localhost:3000',
          basePath: '/'
        },
        apis: [
          './example/routes*.js',
          './example/parameters.yaml'
        ]
      }
    };

    const spec = swaggerJSDoc(options);

    app.get('/api-docs.json', function(req, res) {
      res.setHeader('Content-Type', 'application/json');
      res.send(spec);
    });

 =============================================== */

/**
 * Returns validated Swagger specification in JSON format.
 */

```

